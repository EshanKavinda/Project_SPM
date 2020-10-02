/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.Building;
import com.util.db.SQLite_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ESHAN
 */
public class AllocateRoomService {
   
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultSet;

    public AllocateRoomService() {
    }
    
    public boolean addAllocatedRooms (ArrayList list){
        
        
        String insertQuearyAllocateRooms = "INSERT INTO room_allocations_normal(`session`,`subject`,`lecturerPreffered`,`groupPreffered`) VALUES ('"+list.get(0)+"','"+list.get(1)+"','"+list.get(2)+"','"+list.get(3)+"')";
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(insertQuearyAllocateRooms);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }finally {		
                 
        }

    }
    
}
