package com.weiwei.mvp.base;

/**
 * xuweiwei on 2017/1/9 11:13.
 */

public interface BaseView<T extends BasePresenter> {
    void setPresenter(T presenter);
    void showLoading();
    void hideLoading();
    void showError(String msg);
}
