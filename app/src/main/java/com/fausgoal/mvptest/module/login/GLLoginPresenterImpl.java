package com.fausgoal.mvptest.module.login;

/**
 * Description：1 完成presenter的实现。这里面主要是Model层和View层的交互和操作。
 * <br/> 2  presenter里面还有个OnLoginFinishedListener，
 * <br/> 其在Presenter层实现，给Model层回调，更改View层的状态，
 * <br/> 确保 Model层不直接操作View层。如果没有这一接口在LoginPresenterImpl实现的话，
 * <br/> LoginPresenterImpl只 有View和Model的引用那么Model怎么把结果告诉View呢？
 * <br/><br/>Created by Fausgoal on 16/7/30.
 * <br/><br/>
 */
public class GLLoginPresenterImpl implements GLLoginPresenter, OnLoginFinishedListener {
    private GLLoginView mLoginView = null;
    private GLLoginModel mLoginModel = null;

    public GLLoginPresenterImpl(GLLoginView loginView) {
        this.mLoginView = loginView;
        this.mLoginModel = new GLLoginModelImpl();
        if (null != mLoginView) {
            mLoginView.setListener();
        }
    }

    @Override
    public void validateCredentials(String userName, String password) {
        if (null != mLoginView) {
            mLoginView.showProgress();
        }

        mLoginModel.login(userName, password, this);
    }

    @Override
    public void onDestory() {
        mLoginView = null;
    }

    @Override
    public void onUserNameError() {
        if (null != mLoginView) {
            mLoginView.setUserNameError();
            mLoginView.hideProgress();
        }
    }

    @Override
    public void onPasswordError() {
        if (null != mLoginView) {
            mLoginView.setPasswordError();
            mLoginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if (null != mLoginView) {
            mLoginView.navigateToHome();
            mLoginView.hideProgress();
        }
    }
}
