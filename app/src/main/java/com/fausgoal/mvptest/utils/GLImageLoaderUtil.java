package com.fausgoal.mvptest.utils;

import android.net.Uri;
import android.text.TextUtils;

import com.fausgoal.mvptest.widget.GLImageView;

/**
 * Description：图片加载工具类，统一入口，
 * <br/><br/>Created by Fausgoal on 16/8/1.
 * <br/><br/>
 */
public class GLImageLoaderUtil {
    public static void loadImage(GLImageView imageView, String url) {
        if (TextUtils.isEmpty(url)) {
            return;
        }

        if (null == imageView) {
            throw new NullPointerException("ImageView is null");
        }

        Uri uri = Uri.parse(url);
        imageView.setImageURI(uri);
    }
}
