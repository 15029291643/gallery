package com.example.myapplication.logic.network.util;



import com.example.myapplication.logic.model.Image;

import com.example.myapplication.logic.network.callback.ImageListCallback;
import com.example.myapplication.logic.network.service.ImageService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ImageUtils {
    private static ImageService service;

    private ImageUtils() {
    }

    private static ImageService getService() {
        if (service == null) {
            synchronized (ImageUtils.class) {
                if (service == null) {
                    service = RetrofitUtils.getInstance().create(ImageService.class);
                }
            }
        }
        return service;
    }

    public static void getImageList(String query, ImageListCallback callback) {
        getService().getImage(query).enqueue(new Callback<Image>() {
            @Override
            public void onResponse(Call<Image> call, Response<Image> response) {
                callback.onResponse(response.body().getHits());
            }

            @Override
            public void onFailure(Call<Image> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }


}
