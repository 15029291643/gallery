package com.example.myapplication.ui.Video.player;

import android.media.MediaPlayer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.io.IOException;

public class PlayerViewModel extends ViewModel {
    private final String url;
    private MyMediaPlayer mediaPlayer;
    private final MutableLiveData<Boolean> isVisibility = new MutableLiveData<>();  // 进度条显示

    public LiveData<Boolean> isVisibility() {
        return isVisibility;
    }

    public PlayerViewModel(String url) {
        this.url = url;
        isVisibility.setValue(true);
    }

    public MyMediaPlayer getMediaPlayer() {
        if (mediaPlayer == null) {
            mediaPlayer = new MyMediaPlayer();
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
                    isVisibility.setValue(false);
                }
            });
            mediaPlayer.prepareAsync();  // 准备播放
        }
        return mediaPlayer;
    }
}
