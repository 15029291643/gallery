package com.example.myapplication.logic.network.util;


import android.util.Log;

import com.example.myapplication.logic.model.Video;
import com.example.myapplication.logic.network.callback.VideoListCallback;
import com.example.myapplication.logic.network.service.VideoService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VideoUtils {
    private static final String TAG = "VideoUtils";

    private static VideoService service;

    private VideoUtils() {
    }

    private static VideoService getService() {
        if (service == null) {
            synchronized (VideoUtils.class) {
                if (service == null) {
                    service = RetrofitUtils.getInstance().create(VideoService.class);
                }
            }
        }
        return service;
    }

    public static void getVideoList(String query, VideoListCallback callback) {
        getService().getVideo(query).enqueue(new Callback<Video>() {
            @Override
            public void onResponse(Call<Video> call, Response<Video> response) {
                Log.e(TAG, "onResponse: " + response);
                callback.onResponse(response.body().getHits());
            }

            @Override
            public void onFailure(Call<Video> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
