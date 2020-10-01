/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 *
 * @author Chanuka
 */
//Academic Year and Semester
public class Ays {
    private int aysId;
    private String academicYS;
    
    public Ays(){
        
    }
    
    public Ays(int aysId,String ays){
        this.aysId = aysId;
        this.academicYS = ays;
    }
    
    public int getAysId(){
        return aysId;
    }
    public void setAysId(int aysId){
        this.aysId = aysId;
    }
    public String getAcademicYS(){
        return academicYS;
    }
    public void setAcademicYS(String ays){
        this.academicYS = ays;
    }
    
    
    
}
