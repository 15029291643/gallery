package com.example.myapplication.logic.network.callback;

import com.example.myapplication.logic.model.Video;

import java.util.List;

public interface VideoListCallback {
    void onResponse(List<Video.Hit> videoList);
}
