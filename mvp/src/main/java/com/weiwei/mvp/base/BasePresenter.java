package com.weiwei.mvp.base;

/**
 * xuweiwei on 2017/1/9 11:43.
 */

public interface BasePresenter<T> {
    void attachView(T view);
    void detachView();
}
