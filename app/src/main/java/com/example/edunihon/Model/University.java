package com.example.edunihon.Model;

public class University {
    private Integer imageUniv;
    private String name;
    private int rank;
    private String city;

    public University(Integer imageUniv, String name, int rank, String city){
        this.imageUniv = imageUniv;
        this.name = name;
        this.rank = rank;
        this.city = city;
    }

    public Integer getImageUniv() {
        return imageUniv;
    }

    public void setImageUniv(Integer imageUniv) {
        this.imageUniv = imageUniv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
