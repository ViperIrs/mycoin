package com.example.mycoin5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TelaPassos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_passos);
    }
}