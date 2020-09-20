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
public class Tag {
    
    private int tagId;
    private String tagName;
    
   
    public Tag(){
        
    }
    
     public Tag(int tagId,String tagName){
        this.tagId = tagId;
        this.tagName = tagName;
    }
     
    public int getTagId(){
        return tagId;
    }
    
    public void setTagId(int tagId){
        this.tagId = tagId;
    }
    
    public String getTagName(){
        return tagName;
    }
    
    public void setTagName(String tagName){
        this.tagName = tagName;
    }
}
