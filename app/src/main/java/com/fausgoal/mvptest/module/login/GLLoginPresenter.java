package com.fausgoal.mvptest.module.login;

/**
 * Description：登陆的Presenter 的接口，实现类为LoginPresenterImpl，完成登陆的验证，以及销毁当前vie
 * <br/><br/>Created by Fausgoal on 16/7/30.
 * <br/><br/>
 */
public interface GLLoginPresenter {
    void validateCredentials(String userName, String password);

    void onDestory();
}
