package com.example.dehvi.data.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class LoginDataSource {

    @SerializedName("LoginData")
    @Expose
    private LoginData loginData;
    @SerializedName("UserInfo")
    @Expose
    private UserInfo userInfo;

    public LoginData getLoginData() {
        return loginData;
    }

    public void setLoginData(LoginData loginData) {
        this.loginData = loginData;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }


}
