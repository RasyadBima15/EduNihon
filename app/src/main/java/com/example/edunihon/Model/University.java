package com.example.edunihon.Model;

public class University {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private Integer imageUniv;
    private String name;
    private int rank;
    private String city;

    private String desc;
    private String webUrl;

    public University(int id, Integer imageUniv, String name, int rank, String city, String desc){
        this.id = id;
        this.imageUniv = imageUniv;
        this.name = name;
        this.rank = rank;
        this.city = city;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
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
