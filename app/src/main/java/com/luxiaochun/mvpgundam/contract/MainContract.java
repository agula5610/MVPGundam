package com.luxiaochun.mvpgundam.contract;

import com.luxiaochun.mvpgundam.base.BaseView;
import com.luxiaochun.mvpgundam.presenter.MainPresenter;

/**
 * ProjectName: MVPGundam
 * PackageName: com.luxiaochun.mvpgundam
 * Author: jun
 * Date: 2020-05-27 17:21
 */
public interface MainContract {
    interface Model {
        void login(String username, String password, MainPresenter.OnResponseListener onResponseListener);
    }

    interface View extends BaseView {
        @Override
        void showLoading();

        @Override
        void hideLoading();

        @Override
        void onError();

        void onSuccess();
    }

    interface Presenter {
        /**
         * 登陆
         *
         * @param username
         * @param password
         */
        void login(String username, String password);
    }
}
