package com.example.dehvi.data.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class UserInfo {


    @SerializedName("uid")
    @Expose
    private Integer uid;
    @SerializedName("givenName")
    @Expose
    private String givenName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("role")
    @Expose
    private String role;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
