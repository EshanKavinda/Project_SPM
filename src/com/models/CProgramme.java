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
public class CProgramme {
    
      private int programmeId;
    private String programmeName;
    
   
    public CProgramme(){
        
    }
    
     public CProgramme(int programmeId,String programmeName){
        this.programmeId = programmeId;
        this.programmeName = programmeName;
    }
     
    public int getProgrammeId(){
        return programmeId;
    }
    
    public void setProgrammeId(int programmeId){
        this.programmeId = programmeId;
    }
    
    public String getProgrameName(){
        return programmeName;
    }
    
    public void setProgrammeName(String programmeName){
        this.programmeName = programmeName;
    }
}
