package com.example.mycoin5;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class TelaConceitos extends AppCompatActivity {
    ImageView btnReceitas;
    ImageView btnDespesas;
    ImageView btnOrca;
    ImageView btnPlanejamento;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_conceitos);
        Objects.requireNonNull(getSupportActionBar()).hide();

        ImageView logo = findViewById(R.id.logo);
        btnReceitas = findViewById(R.id.btnReceitas);
        btnDespesas = findViewById(R.id.btnDespesas);
        btnOrca = findViewById(R.id.btnOrca);
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

        btnOrca.setOnClickListener(view -> {
            Intent in = new Intent(TelaConceitos.this, TelaOrcamento.class);
            startActivity(in);
        });

    }
}