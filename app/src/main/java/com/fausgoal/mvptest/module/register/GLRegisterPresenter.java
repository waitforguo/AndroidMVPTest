package com.fausgoal.mvptest.module.register;

/**
 * Description：
 * <br/><br/>Created by Fausgoal on 16/8/1.
 * <br/><br/>
 */
public interface GLRegisterPresenter {
    void sendVCode(String phone);

    void onRegister(String phone, String vcode);
}
