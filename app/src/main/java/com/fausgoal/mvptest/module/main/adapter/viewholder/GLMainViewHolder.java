package com.fausgoal.mvptest.module.main.adapter.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.fausgoal.mvptest.R;
import com.fausgoal.mvptest.utils.GLImageLoaderUtil;
import com.fausgoal.mvptest.widget.GLImageView;

/**
 * Description：
 * <br/><br/>Created by Fausgoal on 16/8/1.
 * <br/><br/>
 */
public class GLMainViewHolder extends RecyclerView.ViewHolder {
    private int mPosition = 0;
    private final GLImageView ivImage;

    public GLMainViewHolder(Context context, View itemView) {
        super(itemView);

        ivImage = (GLImageView) itemView.findViewById(R.id.ivImage);
    }

    public void setValue(int position, String url) {
        mPosition = position;
        GLImageLoaderUtil.loadImage(ivImage, url);
    }
}
