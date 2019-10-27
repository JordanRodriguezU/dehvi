package com.example.dehvi.data.model;
import com.google.gson.annotations.SerializedName;

public class User {


    public User() {
    }

    @SerializedName("password")
    String password;
    @SerializedName("username")
    String username;

    public User(String password, String username) {
        this.password = password;
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
