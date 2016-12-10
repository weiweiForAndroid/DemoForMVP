package com.weiwei.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.weiwei.mvp.entity.ArticlE;
import com.weiwei.mvp.presenter.ArticlePresenter;
import com.weiwei.mvp.view.ArticleView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ArticleView {
    ArticlePresenter presenter;
    ArrayList<ArticlE> articles  = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new ArticlePresenter(this);
        presenter.fetchArticles();
        presenter.loadArticlesFromDB();
        presenter.saveArticals(articles);
    }


    @Override
    public void showArticles(List<ArticlE> articleList) {

    }

    @Override
    public void showLoading() {
        //显示加载进度条

    }

    @Override
    public void hideLoading() {
        //隐藏加载进度条
    }
}
