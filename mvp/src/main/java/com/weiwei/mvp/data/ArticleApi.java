package com.weiwei.mvp.data;

import com.weiwei.mvp.entity.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MUMU on 2016/8/4.
 */
public class ArticleApi {
    List<Article> articles = new ArrayList<>();

    public void fetchArticles(DataListener<Article> listener) {

        //一系列网络异步操作
        listener.onComplete(articles);
    }
}
