/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.util.db.SQLite_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Chanuka
 */
public class SubGroupIdService {
    
     private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultset;
    
    public ResultSet tableLoadSGN(){
        String loadQueary = "SELECT sub_group_number AS 'Sub-Group Number' FROM sgroupn";
        try{
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(loadQueary);
            resultset = preparedStatement.executeQuery();
            
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            
        }
        return resultset;
        
    }
    
}
