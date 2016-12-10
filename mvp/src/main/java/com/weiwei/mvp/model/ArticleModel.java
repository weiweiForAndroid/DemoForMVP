package com.weiwei.mvp.model;

import com.weiwei.mvp.data.DataListener;
import com.weiwei.mvp.entity.ArticlE;

import java.util.List;

/**
 * Created by MUMU on 2016/8/4.
 */
public interface ArticleModel {
    /**
     * 保存文章
     * @param articles
     */
      void   saveArticle(List<ArticlE> articles);
      void   loadArticleFromCache(DataListener<ArticlE> articleDataListener);
}
