package com.fausgoal.mvptest.widget;

import android.content.Context;
import android.util.AttributeSet;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Description：自定义ImageView继承SimpleDraweeView
 * 单独拿出来，如果以后换图片加载器时，只需要换掉这里的继承类即可
 * <br/><br/>Created by Fausgoal on 16/8/1.
 * <br/><br/>
 */
public class GLImageView extends SimpleDraweeView {

    public GLImageView(Context context) {
        super(context);
    }

    public GLImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GLImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
