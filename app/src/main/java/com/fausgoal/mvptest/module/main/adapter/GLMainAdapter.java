package com.fausgoal.mvptest.module.main.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fausgoal.mvptest.R;
import com.fausgoal.mvptest.module.main.adapter.viewholder.GLMainViewHolder;
import com.fausgoal.mvptest.utils.GLListUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Description：
 * <br/><br/>Created by Fausgoal on 16/8/1.
 * <br/><br/>
 */
public class GLMainAdapter extends RecyclerView.Adapter<GLMainViewHolder> {
    private final Context mContext;
    private final LayoutInflater mInflater;

    private List<String> mDatas = null;

    public GLMainAdapter(Context context) {
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
        mDatas = new ArrayList<>();
    }

    public void appendData(String data) {
        if (!TextUtils.isEmpty(data)) {
            mDatas.add(data);
        }
    }

    public void appendData(List<String> datas) {
        if (!GLListUtil.isEmpty(datas)) {
            mDatas.addAll(datas);
        }
    }

    public String getItem(int position) {
        if (GLListUtil.isEmpty(mDatas)) {
            return null;
        }

        return mDatas.get(position);
    }

    @Override
    public GLMainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.adapter_main_layout, parent, false);
        return new GLMainViewHolder(mContext, view);
    }

    @Override
    public void onBindViewHolder(GLMainViewHolder holder, int position) {
        holder.setValue(position, getItem(position));
    }

    @Override
    public int getItemCount() {
        return GLListUtil.getSize(mDatas);
    }
}
