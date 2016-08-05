package com.weiwei.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.weiwei.mvp.entity.Article;
import com.weiwei.mvp.view.ArticleView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ArticleView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void showArticles(List<Article> articleList) {

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
