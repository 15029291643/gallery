package com.example.myapplication.logic.network.service;

import com.example.myapplication.logic.model.Pixabay;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PixabayService {
    @GET("api/?key=24611121-eea8c0ab258962879e8884919&q=yellow+flowers&image_type=photo")
    Call<Pixabay> getPixabay();
}
