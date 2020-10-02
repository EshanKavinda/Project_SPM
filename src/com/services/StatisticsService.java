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
 * @author ESHAN
 */
public class StatisticsService {
    
    
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultSet;

    public StatisticsService() {
    }
    
    public ResultSet getLecturersCount(){
        
        String loadQueary = "SELECT COUNT(*) FROM lecturers";
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
    
    public ResultSet getStudentCount(){
        
        String loadQueary = "SELECT COUNT(*) FROM lecturers";
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
    
    public ResultSet getSubjectsCount(){
        
        String loadQueary = "SELECT COUNT(*) FROM lecturers";
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
