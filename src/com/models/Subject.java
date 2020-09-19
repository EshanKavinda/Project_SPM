/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 *
 * @author ESHAN
 */
public class Subject {
    
    private int subjectId;
    private String subjectName;
    private String subjectCode;
    private String offeredYear;
    private String offeredSemester;
    private int noOfLecHours;
    private int noOftutHours;
    private int noOflabHours;
    private int noOfevalHours;

    public Subject() {
    }

    public Subject(String subjectName, String subjectCode, String offeredYear, String offeredSemester, int noOfLecHours, int noOftutHours, int noOflabHours, int noOfevalHours) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.offeredYear = offeredYear;
        this.offeredSemester = offeredSemester;
        this.noOfLecHours = noOfLecHours;
        this.noOftutHours = noOftutHours;
        this.noOflabHours = noOflabHours;
        this.noOfevalHours = noOfevalHours;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getOfferedYear() {
        return offeredYear;
    }

    public void setOfferedYear(String offeredYear) {
        this.offeredYear = offeredYear;
    }

    public String getOfferedSemester() {
        return offeredSemester;
    }

    public void setOfferedSemester(String offeredSemester) {
        this.offeredSemester = offeredSemester;
    }

    public int getNoOfLecHours() {
        return noOfLecHours;
    }

    public void setNoOfLecHours(int noOfLecHours) {
        this.noOfLecHours = noOfLecHours;
    }

    public int getNoOftutHours() {
        return noOftutHours;
    }

    public void setNoOftutHours(int noOftutHours) {
        this.noOftutHours = noOftutHours;
    }

    public int getNoOflabHours() {
        return noOflabHours;
    }

    public void setNoOflabHours(int noOflabHours) {
        this.noOflabHours = noOflabHours;
    }

    public int getNoOfevalHours() {
        return noOfevalHours;
    }

    public void setNoOfevalHours(int noOfevalHours) {
        this.noOfevalHours = noOfevalHours;
    }
    
    
    
}
