package com.example.mycoin5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaConceitos extends AppCompatActivity {
    ImageView logo;
    TextView btnReceitas;
    TextView btnDespesas;
    TextView btnOrcamento;
    TextView btnPlanejamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_conceitos);
        getSupportActionBar().hide();

        ImageView logo = findViewById(R.id.logo);
        btnReceitas = findViewById(R.id.btnReceitas);
        btnDespesas = findViewById(R.id.btnDespesas);
        btnOrcamento = findViewById(R.id.btnOrcamento);
        btnPlanejamento = findViewById(R.id.btnPlanejamento);


        btnReceitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(TelaConceitos.this, TelaReceitas.class);
                startActivity(in);
            }
        });


        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(TelaConceitos.this, MainActivity.class);
                startActivity(in);
            }
        });
    }
}