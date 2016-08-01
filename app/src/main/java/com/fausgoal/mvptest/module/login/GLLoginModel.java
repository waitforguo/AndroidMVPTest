package com.fausgoal.mvptest.module.login;

/**
 * Description：模拟登陆的操作的接口，实现类为LoginModelImpl.相当于MVP模式中的Model层
 * <br/><br/>Created by Fausgoal on 16/7/30.
 * <br/><br/>
 */
public interface GLLoginModel {
    void login(String userName, String password, GLOnLoginFinishedListener listener);
}
