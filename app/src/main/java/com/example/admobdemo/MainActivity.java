package com.example.admobdemo;

import androidx.appcompat.app.AppCompatActivity;
import dagger.android.AndroidInjection;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
