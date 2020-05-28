package com.luxiaochun.mvpgundam.model;

import com.luxiaochun.mvpgundam.contract.MainContract;
import com.luxiaochun.mvpgundam.presenter.MainPresenter;

/**
 * ProjectName: MVPGundam
 * PackageName: com.luxiaochun.mvpgundam
 * Author: jun
 * Date: 2020-05-27 17:21
 */
public class MainModel implements MainContract.Model {
    @Override
    public void login(String username, String password, MainPresenter.OnResponseListener onResponseListener) {

    }
}
