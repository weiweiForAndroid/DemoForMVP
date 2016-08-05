package com.weiwei.mvp.presenter;

import com.weiwei.mvp.data.ArticleApi;
import com.weiwei.mvp.data.DataListener;
import com.weiwei.mvp.entity.Article;
import com.weiwei.mvp.model.ArticleModel;
import com.weiwei.mvp.model.ArticleModelImpl;
import com.weiwei.mvp.view.ArticleView;

import java.util.List;

/**
 * Created by MUMU on 2016/8/4.
 */
public class ArticlePresenter {
    ArticleView view;
    ArticleModel model = new ArticleModelImpl();
    ArticleApi articleApi = new ArticleApi();

    public ArticlePresenter(ArticleView articleView){
        view = articleView;
    }

    /**
     * 网络获取文章
     */
    public void fetchArticles(){
        view.showLoading();
        articleApi.fetchArticles(new DataListener<Article>() {
            @Override
            public void onComplete(List<Article> t) {
                view.hideLoading();
                view.showArticles(t);
            }
        });
    }

    /**
     * 从数据库获取文章
     */
    public void loadArticlesFromDB(){
        view.showLoading();
        model.loadArticleFromCache(new DataListener<Article>() {
            @Override
            public void onComplete(List<Article> t) {
                view.hideLoading();
                view.showArticles(t);
            }
        });
    }
}
