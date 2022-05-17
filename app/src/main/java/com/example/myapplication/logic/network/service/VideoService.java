package com.example.myapplication.logic.network.service;


import com.example.myapplication.logic.model.Video;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface VideoService {
    // https://pixabay.com
    // @GET("api/videos/?key=" + ConstantUtils.API_KEY)
    @GET("api/videos/?key=24611121-eea8c0ab258962879e8884919")
    Call<Video> getVideo(@Query("q") String query);
}
