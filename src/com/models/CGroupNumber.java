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
public class CGroupNumber {
    private int gnId;
    private String groupNumber;
    
    public CGroupNumber(){
        
    }
    
    public CGroupNumber(int gnId,String groupNumber){
        this.gnId = gnId;
        this.groupNumber = groupNumber;
    }
    
    public int getGnId(){
        return gnId;
    }
    public void setGnId(int gnId){
        this.gnId = gnId;
    }
    
    public String getGroupNumber(){
        return groupNumber;
    }
    public void setGroupNumber(String groupNumber){
        this.groupNumber = groupNumber;
    }
    
}
