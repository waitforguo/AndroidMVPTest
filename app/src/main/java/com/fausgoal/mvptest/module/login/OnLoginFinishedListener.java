package com.fausgoal.mvptest.module.login;

/**
 * Description：登陆事件监听
 * <br/><br/>Created by Fausgoal on 16/7/30.
 * <br/><br/>
 */
public interface OnLoginFinishedListener {
    void onUserNameError();

    void onPasswordError();

    void onSuccess();
}
