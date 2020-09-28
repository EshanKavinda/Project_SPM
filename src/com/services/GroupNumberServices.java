/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.CGroupNumber;
import com.models.SubGroupNumber;
import com.util.db.SQLite_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Chanuka
 */
public class GroupNumberServices {
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultset;
    
    public void addGN(CGroupNumber gn){
       
        String groupNumber = gn.getGroupNumber();
        
        String insertQuearyGN = "INSERT INTO groupn(`group_number`) VALUES ('"+groupNumber+"')";
        
        try{
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(insertQuearyGN);
            boolean result = preparedStatement.execute();
            System.out.println("DB Status : "+result);
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            //Services.closedConnections();
        }
    }
    
    public void addSGN(SubGroupNumber sgn){
       
        String SubgroupNumber = sgn.getSGroupNumber();
        
        String insertQuearySGN = "INSERT INTO Sgroupn(`sub_group_number`) VALUES ('"+SubgroupNumber+"')";
        
        try{
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(insertQuearySGN);
            boolean result = preparedStatement.execute();
            System.out.println("DB Status : "+result);
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            //Services.closedConnections();
        }
    }
    
    public void updateGN(CGroupNumber gn){
        int GNid = gn.getGnId();
        String GNumber = gn.getGroupNumber();
        
        String updateQuearyGN = "UPDATE groupn SET `group_number`='"+GNumber+"' where `GN_Id`='"+GNid+"' ";
        
        try{
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(updateQuearyGN);
            boolean result = preparedStatement.execute();
            System.out.println("DB Status : "+result);
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            //Services.closedConnections();
        }
    }
    
    public void updateSGN(SubGroupNumber sgn){
        int SGNid = sgn.getSGnId();
        String SGNumber = sgn.getSGroupNumber();
        
        String updateQuearySGN = "UPDATE Sgroupn SET `sub_group_number`='"+SGNumber+"' where `SGN_Id`='"+SGNid+"' ";
        
        try{
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(updateQuearySGN);
            boolean result = preparedStatement.execute();
            System.out.println("DB Status : "+result);
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            //Services.closedConnections();
        }
    }
     
     
    public void deleteGN(int gnId){
         String deleteQuearyGN = "DELETE FROM groupn where `GN_id` = '"+gnId+"'";
         
          try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(deleteQuearyGN);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (Exception e) {
            System.out.println(e.toString());
        }finally {		
                 // Services.colsedConnections();
        } 
     }
    
    public void deleteSGN(int sgnId){
        String deleteQuearySGN = "DELETE FROM Sgroupn where `SGN_id` = '"+sgnId+"'";

         try {
           connection = SQLite_Connection.connect();
           preparedStatement = connection.prepareStatement(deleteQuearySGN);
           boolean result = preparedStatement.execute();
           System.out.println("DB status: "+result);
       } catch (Exception e) {
           System.out.println(e.toString());
       }finally {		
                // Services.colsedConnections();
       } 
    }
     
    public ResultSet tableLoadGN(){
       String loadQueary = "SELECT * FROM groupn";
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
     
    public ResultSet tableLoadSGN(){
       String loadQueary = "SELECT * FROM sgroupn";
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
     
    public ResultSet tableLoadGN_Generated(){
       String loadQueary = "SELECT * FROM groupid_generated";
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
     
    public ResultSet tableLoadSGN_Generated(){
       String loadQueary = "SELECT * FROM subgroupid_generated";
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
