package com.example.edunihon.Response;

import com.example.edunihon.Model.University;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UnivResponse {
    @SerializedName("domains")
    private List<String> domains;

    @SerializedName("name")
    private String name;

    @SerializedName("state-province")
    private String stateProvince;

    @SerializedName("country")
    private String country;

    @SerializedName("alpha_two_code")
    private String alphaTwoCode;

    @SerializedName("web_pages")
    private List<String> web_pages;

    // Getter methods
    public List<String> getDomains() {
        return domains;
    }

    public String getName() {
        return name;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public String getCountry() {
        return country;
    }

    public String getAlphaTwoCode() {
        return alphaTwoCode;
    }

    public List<String> getWebPages() {
        return web_pages;
    }
}
