package com.fausgoal.mvptest.module.register;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.fausgoal.mvptest.R;
import com.fausgoal.mvptest.base.GLParentActivity;

/**
 * Description：注册界面
 * <br/><br/>Created by Fausgoal on 16/7/30.
 * <br/><br/>
 */
public class GLRegisterActivity extends GLParentActivity implements GLRegisterView, View.OnClickListener {
    private EditText etPhone = null;
    private EditText etVCode = null;
    private Button btnSendVCode = null;
    private Button btnRegister = null;
    private ProgressBar prgBar = null;

    private GLRegisterPresenterImpl mPresenter = null;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_register);

        etPhone = findView(R.id.etPhone);
        etVCode = findView(R.id.etVCode);
        btnSendVCode = findView(R.id.btnSendVCode);
        btnRegister = findView(R.id.btnRegister);
        prgBar = findView(R.id.prgBar);

        mPresenter = new GLRegisterPresenterImpl(this);
    }

    @Override
    protected void setListener() {
        btnSendVCode.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSendVCode:
                mPresenter.sendVCode(etPhone.getText().toString());
                break;
            case R.id.btnRegister:
                mPresenter.onRegister(etPhone.getText().toString(), etVCode.getText().toString());
                break;
        }
    }

    @Override
    public void setPhoneNumError(String errMsg) {
        etPhone.setError(errMsg);
    }

    @Override
    public void setVCodeError(String errMsg) {
        etVCode.setError(errMsg);
    }

    @Override
    public void sendVCodeSuccess(String vcode) {
        Toast.makeText(this, "验证码发送成功-->" + vcode, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void navigateToHome() {
        Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
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
    protected void onDestroy() {
        mPresenter.onDestroy();
        super.onDestroy();
    }
}
