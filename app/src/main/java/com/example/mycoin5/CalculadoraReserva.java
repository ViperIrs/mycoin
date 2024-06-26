package com.example.mycoin5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculadoraReserva extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_calculadora_reserva);
        SharedPreferences sharedPreferences = getSharedPreferences("Salvamento", Context.MODE_PRIVATE);
        TextView TextViewDin = findViewById(R.id.TextViewDin);
        TextView TextViewDespesa = findViewById(R.id.TextViewDespesa);
        TextView TextViewReceita = findViewById(R.id.TextViewReceita);

        float receitas = sharedPreferences.getFloat("Receita", 0.00f);
        float despesas = sharedPreferences.getFloat("Despesa", 0.00f);
        float Total = receitas - despesas;
        TextViewDin.setText(String.valueOf(Total));
        TextViewDespesa.setText(String.valueOf(despesas));
        TextViewReceita.setText(String.valueOf(receitas));
    }

}
