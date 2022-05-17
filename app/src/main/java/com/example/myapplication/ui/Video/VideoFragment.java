package com.example.myapplication.ui.Video;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;

import androidx.fragment.app.Fragment;

import com.example.myapplication.databinding.FragmentVideoBinding;
import com.example.myapplication.logic.network.util.ConstantUtils;

public class VideoFragment extends Fragment {

    private FragmentVideoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentVideoBinding.inflate(inflater, container, false);
        // String uri = ("android.resource://" + getContext().getPackageName() + "/" + R.raw.video_test);
        binding.videoView.setVideoPath(ConstantUtils.VIDEO_URL2);
        // 设置底部控制视频播放控件
        // binding.videoView.setMediaController(new MediaController(getContext()));
        binding.videoView.requestFocus();//获取焦点
        binding.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
                mp.setLooping(true);
                binding.progressBar2.setVisibility(View.GONE);
                binding.progressBar.setMax(mp.getDuration());
            }
        });
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (binding.videoView.isPlaying()) {
                        binding.progressBar.setProgress(binding.videoView.getCurrentPosition());
                    }
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        return binding.getRoot();
    }
}