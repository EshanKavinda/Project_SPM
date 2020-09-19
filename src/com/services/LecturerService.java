/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.Lecturer;
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
 * @author ESHAN
 */
public class LecturerService {
    
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultSet;
    
    public void addLecture (Lecturer lecturer){
        
        String name = lecturer.getLecturername();
        String employeeId = lecturer.getEmployeeId();
        String faculty = lecturer.getFaculty();
        String department = lecturer.getDepartment();
        String center = lecturer.getCenter();
        String building = lecturer.getBuilding();
        String level = lecturer.getLevel();
        String rank = lecturer.getRank();
        
        String insertQuearyLecturer = "INSERT INTO lecturers(`name`,`employee_id`,`faculty`,`department`,`center`,`building`,`level`,`rank`) VALUES ('"+
                name+"','"+employeeId+"','"+faculty+"','"+department+"','"+center+"','"+building+"','"+level+"','"+rank+"')";
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(insertQuearyLecturer);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public void updateLecturer(Lecturer lecturer){
        int lid = lecturer.getLectureId();
        String name = lecturer.getLecturername();
        String employeeId = lecturer.getEmployeeId();
        String faculty = lecturer.getFaculty();
        String department = lecturer.getDepartment();
        String center = lecturer.getCenter();
        String building = lecturer.getBuilding();
        String level = lecturer.getLevel();
        String rank = lecturer.getRank();
        
        String updateQuearyLecturer = "UPDATE lecturers SET `name`='"+name+"',`employee_id`='"+employeeId+"',`faculty`='"+faculty+"',`department`='"+department+"',`center`='"+center+"',`building`='"+building+"',`level`='"+level+"',`rank`='"+rank+"' where `lecturer_Id`='"+lid+"'";
        
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(updateQuearyLecturer);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public void deleteLecturer(int lecid){
        
        String deleteQuearylecturer = "DELETE FROM lecturers where `lecturer_Id`='"+lecid+"'";
        
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(deleteQuearylecturer);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public ResultSet tableLoadLecturers(){
        String loadQueary = "SELECT * FROM lecturers";
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
    
    public ResultSet tableLoadRooms(){
        String loadQueary = "SELECT * FROM room";
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
    
//    public static void main(String[] args) {
//        LecturerService lecturerService = new LecturerService();
//        Lecturer lecturer = new Lecturer(0, "abcd", "123456", "computing", "OC", "Malabe", "new", "level", "rank");
//        lecturerService.addLecture(lecturer);
//    }
    
}
