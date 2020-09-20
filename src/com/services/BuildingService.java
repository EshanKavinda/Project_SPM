/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.Building;
import com.models.Lecturer;
import com.util.db.SQLite_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ESHAN
 */
public class BuildingService {
    
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultSet;
    
    public boolean addBuilding (Building building){
        
        String name = building.getBuildingName();
        String location = building.getLocation();
        
        String insertQuearyBuilding = "INSERT INTO building(`building_name`,`location`) VALUES ('"+name+"','"+location+"')";
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(insertQuearyBuilding);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public boolean updateBuilding(Building building){
        int bid = building.getBuildingId();
        String name = building.getBuildingName();
        String location = building.getLocation();
        
        String updateQuearyBuilding = "UPDATE building SET `building_name`='"+name+"',`location`='"+location+"' where `building_id`='"+bid+"'";
        
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(updateQuearyBuilding);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public boolean deleteBuilding(int buildingid){
        
        String deleteQuearybuilding = "DELETE FROM building where `building_id`='"+buildingid+"'";
        
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(deleteQuearybuilding);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public ResultSet tableLoadbuilding(){
        String loadQueary = "SELECT * FROM building";
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
    
    public ResultSet getAllBuildings(){
        String loadQueary = "SELECT building_name FROM building";
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
