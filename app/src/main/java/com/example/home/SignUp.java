package com.example.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText etSUEmail, etSUPassword,etSUCPassword;
    Button btnSU;

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
                Intent intent = new Intent(SignUp.this,
                        com.example.home.VerifyAccount.class);
                startActivity(intent);
            }
        });
    }
}