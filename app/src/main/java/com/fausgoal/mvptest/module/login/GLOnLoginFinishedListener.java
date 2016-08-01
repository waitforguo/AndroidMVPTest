package com.fausgoal.mvptest.module.login;

import com.fausgoal.mvptest.base.callback.GLOnFinishedListener;

/**
 * Description：登陆事件监听
 * <br/><br/>Created by Fausgoal on 16/7/30.
 * <br/><br/>
 */
public interface GLOnLoginFinishedListener extends GLOnFinishedListener {
    void onUserNameError();

    void onPasswordError();
}
