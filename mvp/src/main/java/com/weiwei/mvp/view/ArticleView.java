package com.weiwei.mvp.view;

import com.weiwei.mvp.entity.ArticlE;

import java.util.List;

/**
 * Created by MUMU on 2016/8/4.
 */
public interface ArticleView {
    public void showArticles(List<ArticlE> articleList);
    public void showLoading();
    public void hideLoading();
}
