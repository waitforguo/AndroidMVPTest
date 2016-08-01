package com.fausgoal.mvptest.module.main;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.fausgoal.mvptest.R;
import com.fausgoal.mvptest.base.GLParentActivity;
import com.fausgoal.mvptest.module.main.adapter.GLMainAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description：
 * <br/><br/>Created by Fausgoal on 16/8/1.
 * <br/><br/>
 */
public class GLMainActivity extends GLParentActivity {

    private RecyclerView rlvList = null;
    private GLMainAdapter mAdapter = null;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_main);

        rlvList = findView(R.id.rlvList);

        mAdapter = new GLMainAdapter(this);
        rlvList.setLayoutManager(new LinearLayoutManager(this));
        rlvList.setAdapter(mAdapter);

        List<String> urls = getImageurls();
        mAdapter.appendData(urls);
        mAdapter.notifyDataSetChanged();
    }

    private List<String> getImageurls() {
        List<String> urls = new ArrayList<>();
        urls.add("http://b.hiphotos.baidu.com/image/pic/item/908fa0ec08fa513d17b6a2ea386d55fbb2fbd9e2.jpg");
        urls.add("http://g.hiphotos.baidu.com/image/pic/item/e824b899a9014c0870b4e6910f7b02087bf4f473.jpg");
        urls.add("http://g.hiphotos.baidu.com/image/pic/item/b8014a90f603738dafe7c216b61bb051f819ec51.jpg");
        urls.add("http://h.hiphotos.baidu.com/image/pic/item/5bafa40f4bfbfbed9416b3957cf0f736aec31f88.jpg");
        urls.add("http://b.hiphotos.baidu.com/image/pic/item/b3119313b07eca803ce60626952397dda044830b.jpg");
        urls.add("http://d.hiphotos.baidu.com/image/pic/item/0ff41bd5ad6eddc4727431113ddbb6fd5366334c.jpg");
        urls.add("http://b.hiphotos.baidu.com/image/pic/item/03087bf40ad162d983ffe7f615dfa9ec8b13cdc3.jpg");
        urls.add("http://f.hiphotos.baidu.com/image/pic/item/b151f8198618367a9f738e022a738bd4b21ce573.jpg");
        urls.add("http://c.hiphotos.baidu.com/image/pic/item/a2cc7cd98d1001e98b58e4d0bc0e7bec55e7978d.jpg");
        urls.add("http://f.hiphotos.baidu.com/image/pic/item/279759ee3d6d55fbdf1e87f969224f4a21a4dd11.jpg");
        urls.add("http://b.hiphotos.baidu.com/image/pic/item/0824ab18972bd407e4b3edc87e899e510fb3098a.jpg");
        urls.add("http://h.hiphotos.baidu.com/image/pic/item/f31fbe096b63f6245c8d07368244ebf81a4ca336.jpg");
        urls.add("http://d.hiphotos.baidu.com/image/pic/item/5bafa40f4bfbfbed482e084a7df0f736afc31f8b.jpg");
        return urls;
    }
}
