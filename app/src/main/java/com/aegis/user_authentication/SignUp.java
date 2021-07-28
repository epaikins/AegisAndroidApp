package com.aegis.user_authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.home.R;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUp extends AppCompatActivity {

    EditText etSUEmail, etSUPassword,etSUCPassword;
    Button btnSU;

    private static final String TAG = "Email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etSUEmail = findViewById(R.id.etSUEmail);
        etSUPassword = findViewById(R.id.etSUPassword);
        etSUCPassword = findViewById(R.id.etSUCPassword);
        btnSU = findViewById(R.id.btnSU);


        btnSU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Log.i(TAG, etSUEmail.getText().toString());
                Call<ResponseBody> call = RetrofitClient.getmInstance()
                        .getApi()
                        .registerUser(etSUEmail.getText().toString(), etSUPassword.getText().toString(), etSUCPassword.getText().toString());


                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                                String s = response.body().string();
                                Toast.makeText(SignUp.this, s, Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(SignUp.this,
                                        VerifyAccount.class);
                                startActivity(intent);
                            }
                        catch(IOException e){
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        Log.i(TAG,t.getMessage());
                        Toast.makeText(SignUp.this, t.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}