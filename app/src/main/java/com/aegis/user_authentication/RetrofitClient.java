package com.aegis.user_authentication;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// Singleton Class
public class RetrofitClient {

    private static final String BASE_URL = "http://3.251.25.174:8000/auth/";

    private static  RetrofitClient mInstance;

    private Retrofit retrofit;

    private RetrofitClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    public static synchronized RetrofitClient getmInstance(){
        if (mInstance == null) {
            mInstance = new RetrofitClient();
        }
        return mInstance;
    }

    public UserAuthApi getApi(){
        return retrofit.create(UserAuthApi.class);
    }


}
