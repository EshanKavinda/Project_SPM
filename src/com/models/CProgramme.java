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
      private String sprogrammeName;
    
   
    public CProgramme(){
        
    }
    
     public CProgramme(int programmeId,String programmeName,String sprogrammeName){
        this.programmeId = programmeId;
        this.programmeName = programmeName;
        this.sprogrammeName = sprogrammeName;
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
    
    public String getSProgrameName(){
        return sprogrammeName;
    }
    
    public void setSProgrammeName(String sprogrammeName){
        this.sprogrammeName = sprogrammeName;
    }
}
