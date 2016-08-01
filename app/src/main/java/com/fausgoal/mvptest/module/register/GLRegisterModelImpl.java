package com.fausgoal.mvptest.module.register;

import android.text.TextUtils;

/**
 * Description：
 * <br/><br/>Created by Fausgoal on 16/8/1.
 * <br/><br/>
 */
public class GLRegisterModelImpl implements GLRegisterModel {
    @Override
    public void sendVCode(final String phone, final GLOnRegisterFinishedListener listener) {
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (valPhone(phone, listener)) return;

                String vcode = "1234";
                if (null != listener) {
                    listener.sendVCodeSuccess(vcode);
                }
            }
        }, 2000);
    }

    @Override
    public void register(final String phone, final String vcode, final GLOnRegisterFinishedListener listener) {
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (valPhone(phone, listener)) return;

                if (TextUtils.isEmpty(vcode)) {
                    if (null != listener) {
                        listener.onVCodeError("验证码不能为空");
                        return;
                    }
                }

                if (!"1234".equals(vcode)) {
                    if (null != listener) {
                        listener.onVCodeError("验证码错误");
                        return;
                    }
                }

                if (null != listener) {
                    listener.onSuccess();
                }
            }
        }, 2000);
    }

    private boolean valPhone(String phone, GLOnRegisterFinishedListener listener) {
        if (TextUtils.isEmpty(phone) && null != listener) {
            listener.onPhoneError("手机号不能为空");
            return true;
        }
        return false;
    }
}
