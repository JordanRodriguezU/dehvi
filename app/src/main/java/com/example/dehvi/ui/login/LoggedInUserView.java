package com.example.dehvi.ui.login;

/**
 * Class exposing authenticated user details to the UI.
 */
class LoggedInUserView {


    private String userId;
    private String displayName;
    private String tokenLogin ;



    private String access_token;
    private String expires_in;
    private String token_type ;

    private String refresh_token;
    private String scope;


    private String uid;
    private String givenName;
    private String email ;
    private String role ;

    public LoggedInUserView(String userId, String displayName, String tokenLogin, String access_token, String expires_in, String token_type, String refresh_token, String scope, String uid, String givenName, String email, String role) {
        this.userId = userId;
        this.displayName = displayName;
        this.tokenLogin = tokenLogin;
        this.access_token = access_token;
        this.expires_in = expires_in;
        this.token_type = token_type;
        this.refresh_token = refresh_token;
        this.scope = scope;
        this.uid = uid;
        this.givenName = givenName;
        this.email = email;
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getTokenLogin() {
        return tokenLogin;
    }

    public void setTokenLogin(String tokenLogin) {
        this.tokenLogin = tokenLogin;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
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

    public LoggedInUserView() {
    }


}
