package com.example.mycoin5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CalculadoraReceitas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_calculadora_receitas);
    }
}