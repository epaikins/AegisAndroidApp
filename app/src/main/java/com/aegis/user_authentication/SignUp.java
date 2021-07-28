package com.aegis.user_authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.home.R;

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
                Intent intent = new Intent(SignUp.this,
                        VerifyAccount.class);
                startActivity(intent);
            }
        });
    }
}