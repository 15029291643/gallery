package com.example.myapplication.ui.image.photo;


import android.os.Bundle;
import com.example.myapplication.logic.model.Image;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.myapplication.databinding.FragmentPhotoBinding;

public class PhotoFragment extends Fragment {
    private static final String TAG = "PhotoFragment";

    private FragmentPhotoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPhotoBinding.inflate(inflater, container, false);
        Image.Hit image = (Image.Hit) getArguments().getSerializable("image");
        Glide.with(this)
                .load(image.getLargeImageURL())
                .into(binding.photoView);
        return binding.getRoot();
    }
}