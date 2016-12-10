package com.weiwei.mvp.data;

import com.weiwei.mvp.entity.ArticlE;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MUMU on 2016/8/4.
 */
public class ArticleApi {
    List<ArticlE> articles = new ArrayList<>();

    public void fetchArticles(DataListener<ArticlE> listener) {

        //一系列网络异步操作
        listener.onComplete(articles);
    }
}
