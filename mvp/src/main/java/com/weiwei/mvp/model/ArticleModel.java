package com.weiwei.mvp.model;

import com.weiwei.mvp.data.DataListener;
import com.weiwei.mvp.entity.Article;

import java.util.List;

/**
 * Created by MUMU on 2016/8/4.
 */
public interface ArticleModel {
    /**
     * 保存文章
     * @param articles
     */
    public abstract void   saveArticle(List<Article> articles);
    public abstract void   loadArticleFromCache(DataListener<Article> articleDataListener);
}
