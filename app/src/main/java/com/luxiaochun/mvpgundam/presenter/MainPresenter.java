package com.luxiaochun.mvpgundam.presenter;

import com.luxiaochun.mvpgundam.base.BasePresenter;
import com.luxiaochun.mvpgundam.contract.MainContract;
import com.luxiaochun.mvpgundam.model.MainModel;

/**
 * ProjectName: MVPGundam
 * PackageName: com.luxiaochun.mvpgundam
 * Author: jun
 * Date: 2020-05-27 17:22
 */
public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    private MainContract.Model model;

    public MainPresenter() {
        model = new MainModel();
    }

    public interface OnResponseListener {
        void onResponse();

        void onError();
    }

    @Override
    public void login(String username, String password) {
        //View是否绑定 如果没有绑定，就不执行网络请求
        if (!isViewAttached()) {
            return;
        }
        mView.showLoading();
        model.login(username, password, new MainPresenter.OnResponseListener() {
            @Override
            public void onResponse() {
                mView.onSuccess();
                mView.hideLoading();
            }

            @Override
            public void onError() {
                mView.onError();
                mView.hideLoading();
            }
        });
    }
}
