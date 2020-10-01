/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.Tag;
import com.util.db.SQLite_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Chanuka
 */
public class TagServices {
    
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultset;
    
    public void addTag(Tag tag){
        
        String tagName = tag.getTagName();
        
        String insertQuearyTag = "INSERT INTO tags(`tag_type`) VALUES ('"+tagName+"')";
        
        try{
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(insertQuearyTag);
            boolean result = preparedStatement.execute();
            System.out.println("DB Status : "+result);
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            //Services.closedConnections();
        }
    }
    
     public void updateTag(Tag tag){
        int Tid = tag.getTagId();
        String tagName = tag.getTagName();
        
        String updateQuearyTag = "UPDATE tags SET `tag_type`='"+tagName+"' WHERE `tag_id`='"+Tid+"'";
        
        try{
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(updateQuearyTag);
            boolean result = preparedStatement.execute();
            System.out.println("DB Status : "+result);
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            //Services.closedConnections();
        }
    }
     
     public void deleteTag(int tId){
         String deleteQuearyTag = "DELETE FROM tags where `tag_id`='"+tId+"'";
         
          try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(deleteQuearyTag);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (Exception e) {
            System.out.println(e.toString());
        }finally {		
                 // Services.colsedConnections();
        }  
    
     }
     
      public ResultSet tableLoadTags(){
        String loadQueary = "SELECT tag_id AS 'Tag ID',tag_type AS 'Tag Name' FROM tags";
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
