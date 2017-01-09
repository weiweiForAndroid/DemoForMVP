package com.weiwei.mvp.presenter.contract;

import com.weiwei.mvp.base.BasePresenter;
import com.weiwei.mvp.base.BaseView;
import com.weiwei.mvp.entity.Article;

import java.util.List;

/**
 * xuweiwei on 2017/1/9 15:18.
 */

public interface ArticleContract {
    interface View extends BaseView<Presenter>{
        void showArticles(List<Article> t);
    }
    interface Presenter extends BasePresenter{
        void getAticles();
    }
}
