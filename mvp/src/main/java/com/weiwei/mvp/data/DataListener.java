package com.weiwei.mvp.data;

import com.weiwei.mvp.entity.Article;

import java.util.List;

/**
 * Created by MUMU on 2016/8/4.
 */
public interface DataListener<T>{
    /**
     * 数据加载完成
     * @param t
     */
    void onComplete(List<T> t);

}
