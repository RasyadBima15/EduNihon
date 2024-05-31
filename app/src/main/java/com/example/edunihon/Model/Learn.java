package com.example.edunihon.Model;

import java.util.ArrayList;

public class Learn {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private int id;
    private Integer imageLearn;
    private String name;
    private String level;
    private ArrayList<Integer> country;

    private String desc;
    private String app;

    public Learn(int id, Integer imageLearn, String name, String level, ArrayList<Integer> country, String desc, String app){
        this.id = id;
        this.imageLearn = imageLearn;
        this.name = name;
        this.level = level;
        this.country = country;
        this.desc = desc;
        this.app = app;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public Integer getImageLearn() {
        return imageLearn;
    }

    public void setImageLearn(Integer imageLearn) {
        this.imageLearn = imageLearn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public ArrayList<Integer> getCountry() {
        return country;
    }

    public void setCountry(ArrayList<Integer> country) {
        this.country = country;
    }
}
