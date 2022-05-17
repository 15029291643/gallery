package com.example.myapplication.ui.Video.player;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentPlayerBinding;
import com.example.myapplication.logic.network.util.ConstantUtils;

import java.io.IOException;

public class PlayerFragment extends Fragment {

    private PlayerViewModel viewModel;
    private FragmentPlayerBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewModel = new ViewModelProvider(this, new PlayerViewModelFactory(ConstantUtils.VIDEO_URL2)).get(PlayerViewModel.class);
        binding = FragmentPlayerBinding.inflate(inflater, container, false);
        viewModel.isVisibility().observe(getViewLifecycleOwner(), new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                binding.progressBar3.setVisibility(aBoolean ? View.VISIBLE : View.GONE);  // 隐藏进度条
            }
        });
        getLifecycle().addObserver(viewModel.getMediaPlayer());  // 为MediaPlayer绑定生命周期
        // 绑定播放器
        binding.surfaceView.getHolder().addCallback(new SurfaceHolder.Callback2() {
            @Override
            public void surfaceRedrawNeeded(@NonNull SurfaceHolder holder) {
            }

            @Override
            public void surfaceCreated(@NonNull SurfaceHolder holder) {
                viewModel.getMediaPlayer().setDisplay(holder);  // 绑定播放器
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {
            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder holder) {
            }
        });
        return binding.getRoot();
    }
}