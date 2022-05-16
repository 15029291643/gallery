package com.example.myapplication.logic.network.callback;

import com.example.myapplication.logic.model.Image;

import java.util.List;

public interface ImageListCallback {
    void onResponse(List<Image.Hits> imageList);
}
