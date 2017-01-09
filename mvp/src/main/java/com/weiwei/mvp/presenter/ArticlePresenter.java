package com.weiwei.mvp.presenter;

import com.weiwei.mvp.base.RxPresenter;
import com.weiwei.mvp.entity.Article;
import com.weiwei.mvp.presenter.contract.ArticleContract;

import java.util.ArrayList;

/**
 * Created by MUMU on 2016/8/4.
 */
public class ArticlePresenter extends RxPresenter implements ArticleContract.Presenter {
    ArticleContract.View view;

    public ArticlePresenter(ArticleContract.View articleView) {
        view = articleView;
        view.setPresenter(this);
    }


    @Override
    public void getAticles() {
        ArrayList<Article> articles = new ArrayList<>();
        view.showArticles(articles);
        if (articles.size() == 0) {
            view.showError("阿偶，还没有文章~~~");
        }
    }
}
