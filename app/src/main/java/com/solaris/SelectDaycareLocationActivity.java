package com.solaris;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SelectDaycareLocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_daycare_location);

        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setTitle("Back");
    }
}