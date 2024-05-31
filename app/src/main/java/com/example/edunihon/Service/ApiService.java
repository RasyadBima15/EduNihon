package com.example.edunihon.Service;

import com.example.edunihon.Model.University;
import com.example.edunihon.Response.UnivResponse;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("search")
    abstract Call<List<UnivResponse>> getUniversities(@Query("name") String name);
}
