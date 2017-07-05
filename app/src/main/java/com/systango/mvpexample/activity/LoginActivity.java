package com.systango.mvpexample.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import com.systango.mvpexample.R;
import com.systango.mvpexample.contract.LoginContract;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {


    private final static String TAG = LoginActivity.class.getSimpleName();
    @BindView(R.id.etEmail)
    EditText etEmail;
    @BindView(R.id.etPassword)
    EditText etPassword;
    private Context context;
    private LoginContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        context = LoginActivity.this;
        ButterKnife.bind(this);
    }

    @Override
    public void showEmailError(String errorMessage) {
        etEmail.setError(errorMessage);
    }

    @Override
    public void showPasswordError(String errorMessage) {
        etPassword.setError(errorMessage);
    }

    @Override
    public void navigateToHome() {
        Toast.makeText(context, "Login successfully", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btnLogin)
    void onLoginBtnClicked() {

    }

}
