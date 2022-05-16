package com.example.myapplication.logic.network.service;




import com.example.myapplication.logic.network.util.ConstantUtils;
import com.example.myapplication.logic.model.Image;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ImageService {
    @GET("api/?key=" + ConstantUtils.API_KEY + "&image_type=photo")
    Call<Image> getImage(@Query("q") String query);
}
