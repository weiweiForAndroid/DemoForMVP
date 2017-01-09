package com.weiwei.mvp.base;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import com.weiwei.mvp.BuildConfig;

import butterknife.Unbinder;

/**
 * xuweiwei on 2017/1/9 16:12.
 */

public class BaseActivity<T extends BasePresenter> extends Activity {
    protected Unbinder unbinder;
    protected T presenter;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        if (BuildConfig.Log) {
            Log.e(getClass().getSimpleName(), "onCreate");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (BuildConfig.Log) {
            Log.e(getClass().getSimpleName(), "onDestroy");
        }
        if (unbinder != null) unbinder.unbind();
        presenter = null;
    }
}
