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
import com.models.Ays;

/**
 *
 * @author Chanuka
 */
public class GroupIdService {
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultset;
    
    public void addGroupID(Ays ays){
        String groupID = ays.getAcademicYS();
        
        String insertQueryGroupID = "INSERT INTO groupid_generated(`groupid`) VALUES ('"+groupID+"')";
        
         try{
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(insertQueryGroupID);
            boolean result = preparedStatement.execute();
            System.out.println("DB Status : "+result);
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            
        }
    }
    
    public void deleteGroupID(int gID){
        String deleteQuearyGroup = "DELETE FROM groupid_generated where `id` = '"+gID+"'";
        
         try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(deleteQuearyGroup);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (Exception e) {
            System.out.println(e.toString());
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public ResultSet tableLoadAys(){
        String loadQueary = "SELECT academicys FROM ays";
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
        String loadQueary = "SELECT sprogramme_name  FROM programmes";
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
        String loadQueary = "SELECT group_number FROM groupn";
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
    
    public ResultSet tableLoadGID(){
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
    
    
    
}
