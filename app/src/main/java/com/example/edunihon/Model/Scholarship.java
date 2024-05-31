package com.example.edunihon.Model;

public class Scholarship {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private Integer imageScholarship;
    private String name;
    private String provider;
    private String availability;
    private String statusPaid;

    private String startDate;
    private String endDate;
    private String desc;
    private String webUrl;

    public Scholarship(int id, Integer imageScholarship, String name, String provider, String availability, String statusPaid, String startDate, String endDate, String desc, String webUrl){
        this.id = id;
        this.imageScholarship = imageScholarship;
        this.name = name;
        this.provider = provider;
        this.availability = availability;
        this.statusPaid = statusPaid;
        this.startDate = startDate;
        this.endDate = endDate;
        this.desc = desc;
        this.webUrl = webUrl;
    }

    public String getStatusPaid() {
        return statusPaid;
    }

    public void setStatusPaid(String statusPaid) {
        this.statusPaid = statusPaid;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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

    public Integer getImageScholarship() {
        return imageScholarship;
    }

    public void setImageScholarship(Integer imageScholarship) {
        this.imageScholarship = imageScholarship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
