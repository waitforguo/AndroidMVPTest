package com.fausgoal.mvptest.module;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Description：
 * <br/><br/>Created by Fausgoal on 16/8/1.
 * <br/><br/>
 */
public class GLMyApp extends Application {
    public static GLMyApp ins;

    public static GLMyApp getIns() {
        return ins;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        ins = this;

        Fresco.initialize(this);
    }
}
