package com.fausgoal.mvptest.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Description：Activity基类
 * <br/>一些界面上的公用方式在这里处理
 * <br/><br/>Created by Fausgoal on 16/7/30.
 * <br/><br/>
 */
public abstract class GLParentActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();

        initView();

        setListener();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected void setListener() {
    }

    protected <T extends View> T findView(int id) {
        return (T) findViewById(id);
    }
}
