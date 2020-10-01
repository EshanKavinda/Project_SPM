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
public class GroupIdService {
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultset;
    
    public ResultSet tableLoadAys(){
        String loadQueary = "SELECT academicys AS 'Academic Year & Semester' FROM ays";
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
    
    public ResultSet tableLoadPro(){
        String loadQueary = "SELECT programme_name AS 'Programme Name' FROM programmes";
        try {
                connection = SQLite_Connection.connect();
                preparedStatement = connection.prepareStatement(loadQueary);
                resultset= preparedStatement.executeQuery();
            } catch (Exception e) {
                System.out.println(e.toString());
            }finally {		
                      //Services.colsedConnections();
        }
        return resultset;
    }
    
    public ResultSet tableLoadGN(){
        String loadQueary = "SELECT group_number AS 'Group Number' FROM groupn";
        try {
                connection = SQLite_Connection.connect();
                preparedStatement = connection.prepareStatement(loadQueary);
                resultset= preparedStatement.executeQuery();
            } catch (Exception e) {
                System.out.println(e.toString());
            }finally {		
                      //Services.colsedConnections();
        }
        return resultset;
    }
    
}
