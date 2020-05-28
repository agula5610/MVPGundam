package com.luxiaochun.mvpgundam.base;

/**
 * ProjectName: MVPGundam
 * PackageName: com.luxiaochun.mvpgundam
 * Author: jun
 * Date: 2020-05-27 17:13
 */
public interface BaseView {

    /**
     * 显示加载中
     */
    void showLoading();

    /**
     * 隐藏加载
     */
    void hideLoading();

    /**
     * 数据获取失败
     */
    void onError();

}
