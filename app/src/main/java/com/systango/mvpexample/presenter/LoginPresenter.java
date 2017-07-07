package com.systango.mvpexample.presenter;

import android.text.TextUtils;

import com.systango.mvpexample.contract.LoginContract;

/**
 * Created by Mohit Rajput on 6/7/17.
 * TODO: Insert javadoc information here
 */

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View loginView;

    public LoginPresenter(LoginContract.View loginView) {
        this.loginView = loginView;
    }

    @Override
    public void onLoginBtnClicked(String email, String password) {
        if (TextUtils.isEmpty(email)) {
            loginView.showEmailError("Enter your email");
        } else if (TextUtils.isEmpty(password)) {
            loginView.showPasswordError("Enter your password");
        } else {
            loginView.navigateToHome();
        }
    }
}
