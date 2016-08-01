package com.fausgoal.mvptest.module.register;

/**
 * Description：
 * <br/><br/>Created by Fausgoal on 16/8/1.
 * <br/><br/>
 */
public interface GLRegisterModel {
    void sendVCode(String phone, GLOnRegisterFinishedListener listener);

    void register(String phone, String vcode, GLOnRegisterFinishedListener listener);
}
