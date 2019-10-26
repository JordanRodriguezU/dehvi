package com.example.dehvi.data.model;

import com.google.gson.JsonArray;

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

public interface APIClient {


    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://192.168.128.21:8171/ApiServer/api")
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    @POST("/login")
    Call<Object> log2(@Body User user);




}
