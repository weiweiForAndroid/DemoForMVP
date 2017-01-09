package com.weiwei.mvp.ui;

import android.os.Bundle;

import com.weiwei.mvp.R;
import com.weiwei.mvp.base.BaseActivity;
import com.weiwei.mvp.presenter.ArticlePresenter;
import com.weiwei.mvp.presenter.contract.ArticleContract;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity  {
    @BindView(R.id.articel_view)
    ArticleContract.View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
        presenter = new ArticlePresenter(view);
    }
}
