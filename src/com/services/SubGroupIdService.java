/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.Ays;
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
    
    public void addSGroupID(Ays ays){
        String sgroupID = ays.getAcademicYS();
        
        String insertQuerySGroupID = "INSERT INTO subgroupid_generated(`subgroupid`) VALUES ('"+sgroupID+"')";
        
         try{
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(insertQuerySGroupID);
            boolean result = preparedStatement.execute();
            System.out.println("DB Status : "+result);
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            
        }
    }
    
    public void deleteSGroupID(int sgID){
        String deleteQuearySGroup = "DELETE FROM subgroupid_generated where `id` = '"+sgID+"'";
        
         try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(deleteQuearySGroup);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (Exception e) {
            System.out.println(e.toString());
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public ResultSet tableLoadSGN(){
        String loadQueary = "SELECT sub_group_number FROM sgroupn";
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
    
    public ResultSet tableLoadGID(){
        String loadQueary = "SELECT groupid FROM groupid_generated";
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
    
    public ResultSet tableLoadSGID(){
        String loadQueary = "SELECT * FROM subgroupid_generated";
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
