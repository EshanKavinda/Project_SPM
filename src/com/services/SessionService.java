/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.Room;
import com.models.Session;
import com.util.db.SQLite_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SessionService {
    
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultSet;    
    
    public boolean addSession(Session session){
        
        String lecturers = session.getLecturers();
        String subject = session.getSubject();
        String tag = session.getTag();
        String groupId = session.getGroup();
        int numOfStu = session.getNumberOfStudents();
        int duration = session.getDuration();
        
        String insertQuearySession = "INSERT INTO sessions(`lecturer`,`subject`,`tag`,`group_id`,`student_count`,`duration`) VALUES "
                + "('"+lecturers+"','"+subject+"','"+tag+"','"+groupId+"','"+numOfStu+"','"+duration+"')";
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(insertQuearySession);
            boolean result = preparedStatement.execute();
            System.out.println("Session added");
            return true;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public boolean updateSession(Session session){
        
        int sessionId = session.getSessionId();
        String lecturers = session.getLecturers();
        String subject = session.getSubject();
        String tag = session.getTag();
        String groupId = session.getGroup();
        int numOfStu = session.getNumberOfStudents();
        int duration = session.getDuration();
        
        String updateQuearySession = "UPDATE sessions SET `lecturer`='"+lecturers+"',`subject`='"+subject+"',"
                + "`tag`='"+tag+"',`group_id`='"+groupId+"',"
                + "`student_count`='"+numOfStu+"',`duration`='"+duration+"' where `session_id`='"+sessionId+"'";
        
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(updateQuearySession);
            boolean result = preparedStatement.execute();
            System.out.println("Session updated");
            return true;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public boolean deleteSession(int sessionId){
        
        String deleteQuearySession = "DELETE FROM sessions where `session_id`='"+sessionId+"'";
        
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(deleteQuearySession);
            boolean result = preparedStatement.execute();
            System.out.println("session deleted");
            return true;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public ResultSet tableLoadSessions(){
        String loadQueary = "SELECT * FROM sessions";
        try {
                connection = SQLite_Connection.connect();
                preparedStatement = connection.prepareStatement(loadQueary);
                resultSet = preparedStatement.executeQuery();
                System.out.println("sessions loaded........");
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }finally {		
                      //Services.colsedConnections();
            }
        return resultSet;
    }
    
    
    
    
}
