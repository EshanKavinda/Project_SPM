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
public class Available {
    private int avid;
    private String seId;
    private String tiId;
    
    public Available(){
        
    }
    
    public Available(int avid,String seId,String tiId){
        this.avid = avid;
        this.seId = seId;
        this.tiId = tiId;
    }
    
    public int getAvId(){
        return avid;
    }
    public void setAvId(int avId){
        this.avid=avId;
    }
    
     public String getSeId(){
        return seId;
    }
    public void setSeId(String seId){
        this.seId = this.seId;
    }
   public String getTiId(){
       return tiId;
   }
   public void setTiId(String tiId){
       this.tiId = tiId;
   }
}
