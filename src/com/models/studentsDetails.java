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
public class studentsDetails {
    private String itNumber;
    private String Name;
    private String GroupID;
    private String SubGroupID;
    private String center;
    
    
    public studentsDetails(){
        
    }
    
    public studentsDetails(String itNumber,String name,String groupId,String subGroupId,String center){
        this.itNumber = itNumber;
        this.Name = name;
        this.GroupID = groupId;
        this.SubGroupID = subGroupId;
        this.center = center;
    }
    
     public String getItNumber() {
        return itNumber;
    }
      public void setItNumber(String itNumber) {
        this.itNumber = itNumber;
    }
       public String getName() {
        return Name;
    }
       public void setName(String name) {
        this.Name = name;
    }
       public String getGroupId() {
        return GroupID;
    }
        public void setGroupId(String groupId) {
        this.GroupID = groupId;
    }
           public String getSubGroupId() {
        return SubGroupID;
    }
        public void setSubGroupId(String sgroupId) {
        this.SubGroupID = sgroupId;
    }
         public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

}
