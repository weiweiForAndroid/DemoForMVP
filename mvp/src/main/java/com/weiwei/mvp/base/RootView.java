package com.weiwei.mvp.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * xuweiwei on 2017/1/9 15:27.
 */

public abstract class RootView<T extends BasePresenter> extends LinearLayout {
    protected Context mContext;
    private Unbinder unbinder;
    private T mPresenter;

    public RootView(Context context) {
        super(context);
        init();
    }

    public RootView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    public RootView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public RootView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        mContext = getContext();
        getLayout();
        unbinder = ButterKnife.bind(this);
        initView();
        initEvent();
    }

    /**
     * 提供布局
     */
    public abstract void getLayout();

    /**
     * 初始化相关view
     */
    public abstract void initView();

    /**
     * 初始化相关点击事件
     */
    public abstract void initEvent();


    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (mPresenter != null)
            mPresenter.attachView(this);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        mPresenter = null;
        mContext = null;
        unbinder.unbind();
    }
}
