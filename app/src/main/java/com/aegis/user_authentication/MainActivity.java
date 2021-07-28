package com.aegis.user_authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.home.R;

public class MainActivity extends AppCompatActivity {

    Button btnLP;
    TextView tvLPLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLP = findViewById(R.id.btnLP);
        tvLPLogin = findViewById(R.id.tvLPLogin);

        btnLP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        SignUp.class);
                startActivity(intent);
            }
        });

        tvLPLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        Login.class);
                startActivity(intent);
            }
        });
    }
}