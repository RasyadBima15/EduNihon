package com.example.edunihon.Model;

import java.util.ArrayList;

public class Learn {
    private Integer imageLearn;
    private String name;
    private String level;
    private ArrayList<Integer> country;

    public Learn(Integer imageLearn, String name, String level, ArrayList<Integer> country){
        this.imageLearn = imageLearn;
        this.name = name;
        this.level = level;
        this.country = country;
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
