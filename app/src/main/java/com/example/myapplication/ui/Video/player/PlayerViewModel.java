package com.example.myapplication.ui.Video.player;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.ui.MyApplication;

import java.io.IOException;

import java.util.logging.LogRecord;

public class PlayerViewModel extends ViewModel {
    private static final String TAG = "PlayerViewModel";
    private final String url;
    private MyMediaPlayer mediaPlayer = new MyMediaPlayer();
    private final MutableLiveData<Boolean> isVisibility = new MutableLiveData<>();  // 进度条显示
    private final MutableLiveData<Integer> currentProgress = new MutableLiveData<>();  // 百分比进度

    public MutableLiveData<Boolean> getIsVisibility() {
        return isVisibility;
    }

    public MutableLiveData<Integer> getCurrentProgress() {
        return currentProgress;
    }

    public MyMediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    // 构造器
    public PlayerViewModel(String url) {
        this.url = url;
        isVisibility.setValue(true);
        sendProgress();
        initMediaPlayer();
    }

    // 初始化播放器
    private void initMediaPlayer() {
        mediaPlayer.reset();
        try {
            mediaPlayer.setDataSource(url);  // 视频资源
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.setLooping(true);  // 循环播放
        mediaPlayer.setScreenOnWhilePlaying(true);  // 屏幕常亮
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {  // 请求完成监听
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
                isVisibility.setValue(false);  // 网络请求进度条隐藏
            }
        });
        mediaPlayer.prepareAsync();  // 准备播放
    }

    // 更新当前进度
    private void sendProgress() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (mediaPlayer.isPlaying()) {
                        currentProgress.postValue(100 * mediaPlayer.getCurrentPosition() / mediaPlayer.getDuration());
                    }
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
