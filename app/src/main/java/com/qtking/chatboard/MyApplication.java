package com.qtking.chatboard;

import android.app.Application;
import android.content.Context;

/**
 * Created by Think on 2016/12/13.
 */

public class MyApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }
}
