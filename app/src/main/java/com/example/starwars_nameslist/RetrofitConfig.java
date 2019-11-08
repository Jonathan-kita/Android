package com.example.starwars_nameslist;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig()
    {
        OkHttpClient okHttpClient = new OkHttpClient.Builder ()
                .connectTimeout (2, TimeUnit.MINUTES)
                .readTimeout (40, TimeUnit.SECONDS)
                .writeTimeout (20, TimeUnit.SECONDS)
                .build ();

        this.retrofit = new  Retrofit.Builder()
                .baseUrl("https://swapi.co/api/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }
    public Swapi_Interface getSwapiI_interface()
    {
        OkHttpClient okHttpClient = new OkHttpClient.Builder ()
                .connectTimeout (3, TimeUnit.MINUTES)
                .readTimeout (60, TimeUnit.SECONDS)
                .writeTimeout (30, TimeUnit.SECONDS)
                .build ();
        return this.retrofit.create(Swapi_Interface.class);
    }


}