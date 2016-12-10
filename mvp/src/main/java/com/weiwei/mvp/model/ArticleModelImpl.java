package com.weiwei.mvp.model;

import com.weiwei.mvp.data.DataListener;
import com.weiwei.mvp.entity.ArticlE;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MUMU on 2016/8/4.
 */
public class ArticleModelImpl implements ArticleModel {
    ArrayList<ArticlE> mArticles = new ArrayList<>();

    @Override
    public void saveArticle(List<ArticlE> articles) {
        mArticles.addAll(articles);
    }

    @Override
    public void loadArticleFromCache(DataListener<ArticlE> articleDataListener) {
        //一系列從數據庫獲取文章的操作
        articleDataListener.onComplete(mArticles);
    }
}
