/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.studentsDetails;
import com.util.db.SQLite_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.SQLiteConnection;

/**
 *
 * @author Chanuka
 */
public class StudentDService {
    
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultSet;
    
    
    public void updateStudent(studentsDetails sdetails){
        String itNumber = sdetails.getItNumber();
        String name = sdetails.getName();
        String groupId = sdetails.getGroupId();
        String subgroupId = sdetails.getSubGroupId();
        String center = sdetails.getCenter();
        
        String updateQuearyStudent = "UPDATE Students SET `name`='"+name+"',`group_id`='"+groupId+"',`subgroup_id`='"+subgroupId+"',`center`='"+center+"' where `itNumber`='"+itNumber+"'";
        
        
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(updateQuearyStudent);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
      public void deleteStudent(String itNumber){
        
        String deleteQuearystudent = "DELETE FROM students where `itNumber`='"+itNumber+"'";
        
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(deleteQuearystudent);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }finally {		
                 // Services.colsedConnections();
        }  
    }
      
        public ResultSet tableLoadStudents(){
        String loadQueary = "SELECT * FROM students";
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
