package com.example.dehvi.data;

import com.example.dehvi.data.model.APIClient;
import com.example.dehvi.data.model.LoggedInUser;
import com.example.dehvi.data.model.LoginData;
import com.example.dehvi.data.model.User;
import android.os.Bundle;
import java.io.IOException;
import java.util.Iterator;


import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import org.json.JSONArray;
import org.json.JSONObject;


import android.os.Bundle;
import android.view.View;

import android.content.SharedPreferences;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;

import static android.content.Context.MODE_PRIVATE;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource   {

    int status = 0;
    LoggedInUser fakeUser =  new LoggedInUser();



    private Session session;//global variable

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication

            User user =new User();
            user.setPassword(password);
            user.setUsername(username);

            APIClient service = APIClient.retrofit.create(APIClient.class);

            Call<com.example.dehvi.data.model.LoginDataSource> call = service.Login(user);

            call.enqueue(new Callback<com.example.dehvi.data.model.LoginDataSource >()  {
                @Override
                public void onResponse(retrofit2.Call<com.example.dehvi.data.model.LoginDataSource > call, retrofit2.Response<com.example.dehvi.data.model.LoginDataSource > response) {

                        if (200 != response.code()){

                            status = 401 ;

                    }else {

                            status = 200 ;
                            fakeUser.setAccess_token( response.body().getLoginData().getAccessToken());

                        }

                }

                @Override
                public void onFailure(Call<com.example.dehvi.data.model.LoginDataSource > call, Throwable t) {
                    String text= "Incorrect Data ,Try again";

                }

            });


            if (status ==200){



                return new Result.Success<>(fakeUser);


            }else {

                return new Result.Error("Error logging in");

            }


        } catch (Exception e) {

            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication



    }



}
