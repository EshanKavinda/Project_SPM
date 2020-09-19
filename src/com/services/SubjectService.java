/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.Lecturer;
import com.models.Subject;
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
public class SubjectService {
    
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultSet;
    
    public void addSubject (Subject subjects){
        
        String name = subjects.getSubjectName();
        String scode = subjects.getSubjectCode();
        String oyear = subjects.getOfferedYear();
        String osemester = subjects.getOfferedSemester();
        int noOfLechours = subjects.getNoOfLecHours();
        int noOfTuthours = subjects.getNoOftutHours();
        int noOfLabhours = subjects.getNoOflabHours();
        int noOfEvalhours = subjects.getNoOfevalHours();
        
        String insertQuearySubjects = "INSERT INTO subjects(`subject_name`,`subject_code`,`offered_year`,`offered_semester`,`no_of_lecturer_hours`,`no_of_tutorial_hours`,`no_of_lab_hours`,`no_of_evaluation_hours`) VALUES ('"+
                name+"','"+scode+"','"+oyear+"','"+osemester+"','"+noOfLechours+"','"+noOfTuthours+"','"+noOfLabhours+"','"+noOfEvalhours+"')";
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(insertQuearySubjects);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public void updateSubject(Subject subjects){
        int subid = subjects.getSubjectId();
        String name = subjects.getSubjectName();
        String scode = subjects.getSubjectCode();
        String oyear = subjects.getOfferedYear();
        String osemester = subjects.getOfferedSemester();
        int noOfLechours = subjects.getNoOfLecHours();
        int noOfTuthours = subjects.getNoOftutHours();
        int noOfLabhours = subjects.getNoOflabHours();
        int noOfEvalhours = subjects.getNoOfevalHours();
        
        String updateQuearySubject = "UPDATE subjects SET `subject_name`='"+name+"',`subject_code`='"+scode+"',`offered_year`='"+oyear+"',`offered_semester`='"+osemester+"',`no_of_lecturer_hours`='"+noOfLechours+"',`no_of_lab_hours`='"+noOfLabhours+"',`no_of_evaluation_hours`='"+noOfEvalhours+"' where `subject_id`='"+subid+"'";
        
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(updateQuearySubject);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public void deleteSubject(int subid){
        
        String deleteQuearySubject = "DELETE FROM subjects where `subject_id`='"+subid+"'";
        
        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(deleteQuearySubject);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
    public ResultSet tableLoadSubjects(){
        String loadQueary = "SELECT * FROM subjects";
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
