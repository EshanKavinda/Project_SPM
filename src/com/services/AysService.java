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
public class AysService {
    
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultset;
    
    public void addAys(Ays ays){
        String academicYS = ays.getAcademicYS();
        
        String insertQuearyAys = "INSERT INTO ays(`academicys`) VALUES ('"+academicYS+"')";
        
        try{
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(insertQuearyAys);
            boolean result = preparedStatement.execute();
            System.out.println("DB Status : "+result);
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            
        }
    }
    
    public ResultSet tableLoadAys(){
        String loadQueary = "SELECT ays_id AS 'ID',academicys AS 'Academic Year & Semester' FROM ays";
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
    
     public void deleteAys(int aId){
         String deleteQuearyAys = "DELETE FROM ays where `ays_id`='"+aId+"'";
         
          try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(deleteQuearyAys);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (Exception e) {
            System.out.println(e.toString());
        }finally {		
                 // Services.colsedConnections();
        }  
    
     }
    
}
