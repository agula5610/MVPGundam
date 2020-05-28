package com.luxiaochun.mvpgundam.base;

/**
 * ProjectName: MVPGundam
 * PackageName: com.luxiaochun.mvpgundam
 * Author: jun
 * Date: 2020-05-27 17:12
 */
public abstract class BaseMvpFragment<T extends BasePresenter>  extends BaseFragment implements BaseView {

    protected T mPresenter;

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroyView();
    }
}
