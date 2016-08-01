package com.fausgoal.mvptest.module.register;

import com.fausgoal.mvptest.base.GLBasePresenter;

/**
 * Description：
 * <br/><br/>Created by Fausgoal on 16/8/1.
 * <br/><br/>
 */
public class GLRegisterPresenterImpl extends GLBasePresenter implements GLRegisterPresenter, GLOnRegisterFinishedListener {
    private GLRegisterView mRegisterView = null;
    private GLRegisterModel mRegisterModel = null;

    public GLRegisterPresenterImpl(GLRegisterView registerView) {
        mRegisterView = registerView;
        mRegisterModel = new GLRegisterModelImpl();
    }

    @Override
    public void sendVCode(String phone) {
        if (null != mRegisterView) {
            mRegisterView.showProgress();
        }
        mRegisterModel.sendVCode(phone, this);
    }

    @Override
    public void onRegister(String phone, String vcode) {
        if (null != mRegisterView) {
            mRegisterView.showProgress();
        }
        mRegisterModel.register(phone, vcode, this);
    }

    @Override
    public void onPhoneError(String errMsg) {
        if (null != mRegisterView) {
            mRegisterView.hideProgress();
            mRegisterView.setPhoneNumError(errMsg);
        }
    }

    @Override
    public void onVCodeError(String errMsg) {
        if (null != mRegisterView) {
            mRegisterView.hideProgress();
            mRegisterView.setVCodeError(errMsg);
        }
    }

    @Override
    public void sendVCodeSuccess(String vcode) {
        if (null != mRegisterView) {
            mRegisterView.hideProgress();
            mRegisterView.sendVCodeSuccess(vcode);
        }
    }

    @Override
    public void onSuccess() {
        if (null != mRegisterView) {
            mRegisterView.navigateToHome();
            mRegisterView.hideProgress();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mRegisterView = null;
    }
}
