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
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Field;

public interface APIClient {


    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://192.168.128.21:8171/ApiServer/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    @POST("login")
    Call<Object> log2(@Body User user);

    @Headers({
            "Authorization: Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IjlCQ0U2OTc1MDUzMkU3QjNEOUU3MkU4ODcwOTZENDk2RUEyNzdBOEIiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJtODVwZFFVeTU3UFo1eTZJY0piVWx1b25lb3MifQ.eyJuYmYiOjE1NzIxNjEzNTAsImV4cCI6MTU3MjE2NDk1MCwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MTcxL2F1dGhzZXJ2ZXIiLCJhdWQiOlsiaHR0cDovL2xvY2FsaG9zdDo4MTcxL2F1dGhzZXJ2ZXIvcmVzb3VyY2VzIiwiRGVodmlBUEkiXSwiY2xpZW50X2lkIjoiZGVodmlfYXBpIiwic3ViIjoiMSIsImF1dGhfdGltZSI6MTU3MjE2MTM1MCwiaWRwIjoibG9jYWwiLCJnaXZlbl9uYW1lIjoiWW9uYXRhbiBMZWl0b24iLCJlbWFpbCI6ImphcWxvdWkxQGdtYWlsLmNvbSIsInJvbGUiOiI1Iiwiem9uZWluZm8iOiIxIiwic2NvcGUiOlsiZW1haWwiLCJvcGVuaWQiLCJyb2xlIiwiYXBpLnJlc291cmNlIiwib2ZmbGluZV9hY2Nlc3MiXSwiYW1yIjpbInB3ZCJdfQ.AqnAK_zc0KCyBBr-CTcxq9xxnKSCPL1oBeEPQttTlnS_gitwAYGACqBsYxhdklBjn2_F6CwiVJkMssiv-vP0-hgN3vTAMdBcgz2n8O8iw5L40eYgPLJYETzSoY1h0ixC2Gv6IRjNhZZHKdRUUH1oKFKGylKMdtG6bQT25vKh0py9JPT-LJ3WtJ1drRsl8rsogi83nl89AfYyQLJ6TZ5VXJw0429Hx8fjhOxR-L1QNf8c7At26gOGaZQbl-Dn0prvqhPuJCT1BdOUFT6katY2Ix6vDvNlADkN6zUSU2at0F-MdnyswTFLeNS-5DRgNdpbF0FVv8skWLTHszBpqp7RaA"
    })
    @GET("Student/GetMyStudents")
    Call<List<Student>> getStudents();




}
