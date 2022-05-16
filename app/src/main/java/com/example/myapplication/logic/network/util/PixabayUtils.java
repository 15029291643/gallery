package com.example.myapplication.logic.network.util;

import com.example.myapplication.logic.model.Pixabay;
import com.example.myapplication.logic.network.callback.PixabayCallback;
import com.example.myapplication.logic.network.service.PixabayService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PixabayUtils {
    private static PixabayService service;

    private PixabayUtils() {
    }

    private static PixabayService getService() {
        if (service == null) {
            synchronized (PixabayService.class) {
                if (service == null) {
                    service = RetrofitUtils.getInstance().create(PixabayService.class);
                }
            }
        }
        return service;
    }

    public static void getPixabay(PixabayCallback callback) {
        getService().getPixabay().enqueue(new Callback<Pixabay>() {
            @Override
            public void onResponse(Call<Pixabay> call, Response<Pixabay> response) {
                callback.onResponse(response.body());
            }

            @Override
            public void onFailure(Call<Pixabay> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
