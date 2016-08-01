package com.fausgoal.mvptest.module.register;

import com.fausgoal.mvptest.base.callback.GLBaseView;

/**
 * Description：
 * <br/><br/>Created by Fausgoal on 16/8/1.
 * <br/><br/>
 */
public interface GLRegisterView extends GLBaseView {
    void setPhoneNumError(String errMsg);

    void setVCodeError(String errMsg);

    void sendVCodeSuccess(String vcode);

    void navigateToHome();
}
