package com.luxiaochun.mvpgundam;


import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.luxiaochun.mvpgundam.base.BaseMvpActivity;
import com.luxiaochun.mvpgundam.contract.MainContract;
import com.luxiaochun.mvpgundam.presenter.MainPresenter;


public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainContract.View {

    TextInputEditText etUsernameLogin;
    TextInputEditText etPasswordLogin;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        mPresenter = new MainPresenter();
        mPresenter.attachView(this);
    }

    /**
     * @return 帐号
     */
    private String getUsername() {
        return etUsernameLogin.getText().toString().trim();
    }

    /**
     * @return 密码
     */
    private String getPassword() {
        return etPasswordLogin.getText().toString().trim();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onError() {

    }

    @Override
    public void onSuccess() {
//        Toast.makeText(this, bean.getErrorMsg(), Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void onViewClicked() {
        if (getUsername().isEmpty() || getPassword().isEmpty()) {
            Toast.makeText(this, "帐号密码不能为空", Toast.LENGTH_SHORT).show();
            return;
        }
        mPresenter.login(getUsername(), getPassword());
    }
}
