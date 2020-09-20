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
public class SubGroupNumber {
     private int sgnId;
    private String sgroupNumber;
    
    public SubGroupNumber(){
        
    }
    
    public SubGroupNumber(int sgnId,String gsroupNumber){
        this.sgnId = sgnId;
        this.sgroupNumber = sgroupNumber;
    }
    
    public int getSGnId(){
        return sgnId;
    }
    public void setSGnId(int sgnId){
        this.sgnId = sgnId;
    }
    
    public String getSGroupNumber(){
        return sgroupNumber;
    }
    public void setSGroupNumber(String sgroupNumber){
        this.sgroupNumber = sgroupNumber;
    }
    
}
