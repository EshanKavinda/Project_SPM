/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.Building;
import com.models.Room;
import com.util.db.SQLite_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ESHAN
 */
public class RoomService {
    
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultSet;
    
    public boolean addRoom(Room room){
        
        String roomName = room.getRoomName();
        String buildingName = room.getBuildingName();
        String capacity = room.getCapacity();
        String type = room.getType();
        
        String insertQuearyRoom = "INSERT INTO room(`building_name`,`room_name`,`capacity`,`type`) VALUES ('"+buildingName+"','"+roomName+"','"+capacity+"','"+type+"')";
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(insertQuearyRoom);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public boolean updateRoom(Room room){
        
        int rid = room.getRoomId();
        String roomName = room.getRoomName();
        String buildingName = room.getBuildingName();
        String capacity = room.getCapacity();
        String type = room.getType();
        
        String updateQuearyRoom = "UPDATE room SET `building_name`='"+buildingName+"',`room_name`='"+roomName+"',`capacity`='"+capacity+"',`type`='"+type+"' where `room_id`='"+rid+"'";
        
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(updateQuearyRoom);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public boolean deleteRoom(int roomid){
        
        String deleteQuearyRoom = "DELETE FROM room where `room_id`='"+roomid+"'";
        
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(deleteQuearyRoom);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public ResultSet tableLoadRooms(){
        String loadQueary = "SELECT * FROM room";
        try {
                connection = SQLite_Connection.connect();
                preparedStatement = connection.prepareStatement(loadQueary);
                resultSet = preparedStatement.executeQuery();
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }finally {		
                      //Services.colsedConnections();
            }
        return resultSet;
    }
    
}
