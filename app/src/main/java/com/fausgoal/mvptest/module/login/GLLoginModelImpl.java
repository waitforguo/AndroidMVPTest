package com.fausgoal.mvptest.module.login;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Description：延时模拟登陆（2s），如果名字或者密码为空则登陆失败，否则登陆成功
 * <br/><br/>Created by Fausgoal on 16/7/30.
 * <br/><br/>
 */
public class GLLoginModelImpl implements GLLoginModel {

    @Override
    public void login(final String userName, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isError = false;
                if (TextUtils.isEmpty(userName)) {
                    if (null != listener) {
                        listener.onUserNameError();
                    }
                    isError = true;
                } else if (TextUtils.isEmpty(password)) {
                    if (null != listener) {
                        listener.onPasswordError();
                    }
                    isError = true;
                }

                if (!isError) {
                    if (null != listener) {
                        listener.onSuccess();
                    }
                }
            }
        }, 2000);
    }
}
