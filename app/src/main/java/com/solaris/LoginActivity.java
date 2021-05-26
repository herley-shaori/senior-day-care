package com.solaris;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.getSupportActionBar().hide();
        findViewById(R.id.loginButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView emailInput = findViewById(R.id.emailInput);
                TextView passwordInput = findViewById(R.id.passwordInput);
                if((emailInput.getText().toString().equals("alen@gmail.com")) && (passwordInput.getText().toString().equals("rahasia"))){
                    Intent intent = new Intent(LoginActivity.this, DaycareDateActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Username atau Password salah.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}