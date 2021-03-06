package com.fausgoal.mvptest.module.login;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.fausgoal.mvptest.R;
import com.fausgoal.mvptest.base.GLParentActivity;
import com.fausgoal.mvptest.module.main.GLMainActivity;
import com.fausgoal.mvptest.module.register.GLRegisterActivity;

/**
 * Description： MVP模式中View层对应一个activity，这里是登陆的activity
 * demo的代码流程：Activity做了一些UI初始化的东西并需要实例化对应
 * LoginPresenter的引用和实现 LoginView的接口，监听界面动作，
 * Go按钮按下后即接收到查询天气的事件，在onClick里接收到即通过LoginPresenter
 * 的引用把它交给LoginPresenter处理。LoginPresenter接收到了登陆的逻辑就知道要登陆了，
 * 然后LoginPresenter显示进度条并且把逻辑交给我们的Model去处理，也就是这里面的LoginModel，
 * （LoginModel的实现类LoginModelImpl），同时会把OnLoginFinishedListener也就是LoginPresenter
 * 自身传递给我们的Model（LoginModel）。LoginModel处理完逻辑之后，结果通过
 * OnLoginFinishedListener回调通知LoginPresenter，LoginPresenter再把结果返回给view层的Activity，
 * 最后activity显示结果
 * <br/><br/>Created by Fausgoal on 16/7/30.
 * <br/><br/>
 */
public class GLLoginActivity extends GLParentActivity implements GLLoginView, View.OnClickListener {

    private EditText etUserName = null;
    private EditText etPassword = null;
    private Button btnLogin = null;
    private ProgressBar prgBar = null;
    private Button btnRegister = null;

    private GLLoginPresenterImpl presenter = null;

    @Override
    protected void initData() {
        presenter = new GLLoginPresenterImpl(this);
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_login);

        etUserName = findView(R.id.etUserName);
        etPassword = findView(R.id.etPassword);
        btnLogin = findView(R.id.btnLogin);
        prgBar = findView(R.id.prgBar);
        btnRegister = findView(R.id.btnRegister);
    }

    @Override
    public void setUserNameError() {
        etUserName.setError("用户名错误");
    }

    @Override
    public void setPasswordError() {
        etPassword.setError("密码错误");
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this, GLMainActivity.class));
        onBackPressed();
    }

    @Override
    public void showProgress() {
        prgBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        prgBar.setVisibility(View.GONE);
    }

    @Override
    public void setListener() {
        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogin:
                String strUserName = etUserName.getText().toString();
                String strPassword = etUserName.getText().toString();
                presenter.validateCredentials(strUserName, strPassword);
                break;
            case R.id.btnRegister:
                startActivity(new Intent(this, GLRegisterActivity.class));
                break;
        }
    }

    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }
}
