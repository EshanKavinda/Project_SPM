/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.CProgramme;
import com.util.db.SQLite_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Chanuka
 */
public class programmeServices {
    
     private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultset;
    
    
     public void addProgramme(CProgramme p){
        
        String programmeName = p.getProgrameName();
        String sprogrammeName = p.getSProgrameName();
        
        String insertQuearyProgramme = "INSERT INTO programmes(`programme_name`,`sprogramme_name`) VALUES ('"+programmeName+"','"+sprogrammeName+"')";
        
        try{
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(insertQuearyProgramme);
            boolean result = preparedStatement.execute();
            System.out.println("DB Status : "+result);
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            //Services.closedConnections();
        }
    }
    
      public void updateProgramme(CProgramme p){
        int Pid = p.getProgrammeId();
        String PName = p.getProgrameName();
        String SPName = p.getSProgrameName();
        
        String updateQuearyProgramme = "UPDATE programmes SET `programme_name`='"+PName+"',`sprogramme_name`='"+SPName+"' where `programme_id`='"+Pid+"' ";
        
        try{
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(updateQuearyProgramme);
            boolean result = preparedStatement.execute();
            System.out.println("DB Status : "+result);
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            //Services.closedConnections();
        }
    }
      
      
       public void deleteProgramme(int PId){
         String deleteQuearyProgramme = "DELETE FROM programmes where `programme_id` = '"+PId+"'";
         
          try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(deleteQuearyProgramme);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (Exception e) {
            System.out.println(e.toString());
        }finally {		
                 // Services.colsedConnections();
        }  
    
     }
       
       
       public ResultSet tableLoadProgrammes(){
        String loadQueary = "SELECT * FROM programmes";
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
