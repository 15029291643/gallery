package com.example.myapplication.ui.Video.player;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentPlayerBinding;
import com.example.myapplication.logic.network.util.ConstantUtils;

import java.io.IOException;

public class PlayerFragment extends Fragment {
    private static final String TAG = "PlayerFragment";

    private PlayerViewModel viewModel;
    private FragmentPlayerBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPlayerBinding.inflate(inflater, container, false);
        viewModel = new ViewModelProvider(this, new PlayerViewModelFactory(ConstantUtils.VIDEO_URL2)).get(PlayerViewModel.class);
        // 绑定生命周期
        getLifecycle().addObserver(viewModel.getMediaPlayer());
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
        // 隐藏进度条
        viewModel.getIsVisibility().observe(getViewLifecycleOwner(), new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                binding.progressBar3.setVisibility(aBoolean ? View.VISIBLE : View.GONE);  // 隐藏进度条
            }
        });
        // 更新当前进度
        viewModel.getCurrentProgress().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                binding.progressBar5.setProgress(integer);
            }
        });
        return binding.getRoot();
    }
}