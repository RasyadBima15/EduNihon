package com.example.edunihon.Model;

import java.util.ArrayList;

public class User {
    private String fullname;
    private String educationLevel;
    private String univ;
    private String studyProgram;
    private ArrayList<String> language;

    public User(String fullname, String educationLevel, String univ, String studyProgram, ArrayList<String> language){
        this.fullname = fullname;
        this.educationLevel = educationLevel;
        this.univ = univ;
        this.studyProgram = studyProgram;
        this.language = language;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getUniv() {
        return univ;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    public ArrayList<String> getLanguage() {
        return language;
    }

    public void setLanguage(ArrayList<String> language) {
        this.language = language;
    }
}
