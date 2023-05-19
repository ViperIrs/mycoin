package com.example.mycoin5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView btnConceitos;
    ImageView botaoreceita;
    ImageView botaoreserva;
    ImageView botaodespesa;

    TextView txtdireitos;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        btnConceitos = findViewById(R.id.btnConceitos);
        botaoreceita = findViewById(R.id.botaoreceita);
        botaoreserva = findViewById(R.id.botaoreserva);
        botaodespesa = findViewById(R.id.botaodespesa);
        txtdireitos = findViewById(R.id.txtdireitos);

        botaoreceita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, CalculadoraReceitas.class);
                startActivity(in);
            }
        });

        botaodespesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, CalculadoraDespesas.class);
                startActivity(in);
            }
        });

        botaoreserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, CalculadoraReserva.class);
                startActivity(in);
            }
        });

        btnConceitos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(MainActivity.this, TelaConceitos.class);
                startActivity(in);
            }
        });

        txtdireitos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(MainActivity.this, TelaCreditos.class);
                startActivity(in);
            }
        });

    }

    public void TelaConceitos(View view) {
        Intent in = new Intent(MainActivity.this, TelaConceitos.class);
        startActivity(in);
    }
}