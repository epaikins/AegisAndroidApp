package com.aegis.user_authentication;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

public interface UserAuthApi {

    @POST("registration")
    Call<ResponseBody> registerUser(
            @Field("email") String email,
            @Field("email") String password,
            @Field("email") String confirm_password
    );
}
