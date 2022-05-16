package com.example.myapplication.ui.gallery;



import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.logic.model.Image;
import com.example.myapplication.logic.network.callback.ImageListCallback;
import com.example.myapplication.logic.network.util.ImageUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GalleryViewModel extends ViewModel {
    private final MutableLiveData<List<Image.Hits>> imageList = new MutableLiveData<>();
    private final Random random = new Random();

    public MutableLiveData<List<Image.Hits>> getImageList() {
        return imageList;
    }

    public void setImageList() {
        ArrayList<String> queryList = new ArrayList<>(Arrays.asList("猫", "狗", "猪", "兔", "羊"));
        ImageUtils.getImageList(queryList.get(random.nextInt(queryList.size())), new ImageListCallback() {
            @Override
            public void onResponse(List<Image.Hits> imageList) {
                GalleryViewModel.this.imageList.setValue(imageList);
            }
        });
    }
}
