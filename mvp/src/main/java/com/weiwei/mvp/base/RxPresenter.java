package com.weiwei.mvp.base;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * xuweiwei on 2017/1/9 11:20.
 */

public abstract class RxPresenter<T> implements BasePresenter<T> {
    protected T mView;
    private CompositeSubscription compositeSubscription;

    /**
     * Rx 的防止内存泄漏，通过rootView的生命周期去进行管理
     */
    private void unSubscribe() {
        if (compositeSubscription != null) {
            compositeSubscription.unsubscribe();
        }
    }

    protected void addSubscribe(Subscription subscription) {
        compositeSubscription.add(subscription);
    }

    @Override
    public void detachView() {
        unSubscribe();
    }

    @Override
    public void attachView(T view) {
        this.mView = view;
    }
}
