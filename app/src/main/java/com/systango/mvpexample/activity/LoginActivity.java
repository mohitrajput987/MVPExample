package com.systango.mvpexample.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.systango.mvpexample.R;
import com.systango.mvpexample.contract.LoginContract;

public class LoginActivity extends AppCompatActivity implements LoginContract.View{

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
  }

  @Override
  public void showEmailError(String errorMessage) {

  }

  @Override
  public void showPasswordError(String errorMessage) {

  }

  @Override
  public void navigateToHome() {

  }
}
