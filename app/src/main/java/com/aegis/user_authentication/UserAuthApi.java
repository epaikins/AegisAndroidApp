package com.aegis.user_authentication;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserAuthApi {

    @FormUrlEncoded
    @POST("registration")
    Call<ResponseBody> registerUser(
            @Field("email") String email,
            @Field("password") String password,
            @Field("confirm_password") String confirm_password

    );

}
