package com.example.myapplication.ui;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
    private static Context content;

    public static Context getContent() {
        return content;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        content = this;
    }
}
