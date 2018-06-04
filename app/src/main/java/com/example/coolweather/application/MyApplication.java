package com.example.coolweather.application;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2018/6/3.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
        super.onCreate();
    }
    public static Context getContext(){
        return context;
    }
}
