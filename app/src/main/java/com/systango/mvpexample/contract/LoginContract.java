package com.systango.mvpexample.contract;

/**
 * Created by Deepti Mota on 26/6/17.
 * TODO: Insert javadoc information here
 */

public class LoginContract {

  public interface View {

    void showEmailError(String errorMessage);

    void showPasswordError(String errorMessage);

    void navigateToHome();
  }

  public interface Presenter{
    void onLoginBtnClicked();
  }

  public interface Repository{
    String login(String email, String password);
  }
}
