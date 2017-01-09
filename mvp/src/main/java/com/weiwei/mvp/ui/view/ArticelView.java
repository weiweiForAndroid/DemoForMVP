package com.weiwei.mvp.ui.view;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;

import com.weiwei.mvp.R;
import com.weiwei.mvp.base.RootView;
import com.weiwei.mvp.entity.Article;
import com.weiwei.mvp.presenter.contract.ArticleContract;

import java.util.List;

/**
 * xuweiwei on 2017/1/9 15:48.
 */

public class ArticelView extends RootView<ArticleContract.Presenter> implements ArticleContract.View,SwipeRefreshLayout.OnRefreshListener {
    public ArticelView(Context context) {
        super(context);
    }

    public ArticelView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ArticelView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ArticelView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void getLayout() {
        inflate(mContext, R.layout.activity_main,this);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initEvent() {

    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void showArticles(List<Article> t) {

    }

    @Override
    public void setPresenter(ArticleContract.Presenter presenter) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String msg) {

    }
}
