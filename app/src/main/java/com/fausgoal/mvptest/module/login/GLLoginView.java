package com.fausgoal.mvptest.module.login;

import com.fausgoal.mvptest.base.callback.GLBaseView;

/**
 * Description：登陆View的接口，实现类也就是登陆的activity
 * <br/><br/>Created by Fausgoal on 16/7/30.
 * <br/><br/>
 */
public interface GLLoginView extends GLBaseView {
    void setUserNameError();

    void setPasswordError();

    void navigateToHome();
}
