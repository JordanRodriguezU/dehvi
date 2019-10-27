package com.example.dehvi.data.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;

import org.json.JSONArray;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Field;
import retrofit2.Call;
import retrofit2.Callback;
import org.json.JSONArray;
import org.json.JSONObject;


public interface APIClient {


    // Trailing slash is needed
    public static final String BASE_URL = "http://192.168.128.21:8171/ApiServer/api/";
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    @POST("login")
    Call<LoginDataSource> Login(@Body User user);




}
