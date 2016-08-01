package com.fausgoal.mvptest.module.register;

import com.fausgoal.mvptest.base.callback.GLOnFinishedListener;

/**
 * Description：
 * <br/><br/>Created by Fausgoal on 16/8/1.
 * <br/><br/>
 */
public interface GLOnRegisterFinishedListener extends GLOnFinishedListener {
    void onPhoneError(String errMsg);

    void onVCodeError(String errMsg);

    void sendVCodeSuccess(String vcode);
}
