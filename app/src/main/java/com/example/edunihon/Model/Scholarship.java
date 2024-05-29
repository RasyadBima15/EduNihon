package com.example.edunihon.Model;

public class Scholarship {
    private Integer imageScholarship;
    private String name;
    private String provider;
    private String availability;

    public Scholarship(Integer imageScholarship, String name, String provider, String availability){
        this.imageScholarship = imageScholarship;
        this.name = name;
        this.provider = provider;
        this.availability = availability;
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
