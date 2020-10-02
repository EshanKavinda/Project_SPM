/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.Session;
import com.models.Available;
import com.models.WorkingDaysAndHoursModel;
import com.util.db.SQLite_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Chanuka
 */
public class Avalibilitys {
    
     private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultset;
    
    public ResultSet tableLoadSession(){
        String loadQueary = "SELECT session_id,lecturer,subject,tag,group_id,duration FROM sessions";
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
    
    public ResultSet tableLoadTimeslots(){
        String loadQueary = "SELECT id,slot_date,time_slot_start,slot_description,time_slot_end FROM working_days_and_hours";
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
    
     public ResultSet tableLoadAvailable(){
        String loadQueary = "SELECT * FROM Available";
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
     
      public void addGroupID(Available ays){
        String groupID = ays.getSeId();
        String tID = ays.getTiId();
        
        String insertQueryAvailable = "INSERT INTO Available(`se_id`,`time_id`) VALUES ('"+groupID+"','"+tID+"')";
        
         try{
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(insertQueryAvailable);
            boolean result = preparedStatement.execute();
            System.out.println("DB Status : "+result);
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            
        }
    }
      
       public void deleteAvailable(int gID){
        String deleteQuearyAvailable = "DELETE FROM Available where `id` = '"+gID+"'";
        
         try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(deleteQuearyAvailable);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (Exception e) {
            System.out.println(e.toString());
        }finally {		
                 // Services.colsedConnections();
        }  
    }
   
   
    
}
