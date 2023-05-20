package com.example.mycoin5;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class TelaConceitos extends AppCompatActivity {
    ImageView btnReceitas;
    ImageView btnOrcamento;
    ImageView btnDespesas;
    ImageView btnPlanejamento;

 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_conceitos);
        Objects.requireNonNull(getSupportActionBar()).hide();

        ImageView logo = findViewById(R.id.logo);
        btnOrcamento = findViewById(R.id.btnOrcamento);
        btnReceitas = findViewById(R.id.btnReceitas);
        btnDespesas = findViewById(R.id.btnDespesas);
        btnPlanejamento = findViewById(R.id.btnPlanejamento);

        btnDespesas.setOnClickListener(view -> {
            Intent in = new Intent(TelaConceitos.this, TelaDespesas.class);
            startActivity(in);
        });

        btnReceitas.setOnClickListener(view -> {
            Intent in = new Intent(TelaConceitos.this, TelaReceitas.class);
            startActivity(in);
        });

        btnPlanejamento.setOnClickListener(view -> {
            Intent in = new Intent(TelaConceitos.this, TelaPlanejamento.class);
            startActivity(in);
        });

        logo.setOnClickListener(view -> {
            Intent in = new Intent(TelaConceitos.this, MainActivity.class);
            startActivity(in);
        });

        btnOrcamento.setOnClickListener(view -> {
            Intent in = new Intent(TelaConceitos.this, TelaOrcamento2.class);
            startActivity(in);
        });


    }
}