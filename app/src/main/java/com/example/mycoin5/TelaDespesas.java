package com.example.mycoin5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaDespesas extends AppCompatActivity {
    TextView btnDespesasFixas;
    TextView btnDespesasVariaveis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_despesas);

        btnDespesasFixas = findViewById(R.id.btnDespesasFixas);
        btnDespesasVariaveis = findViewById(R.id.btnDespesasVariaveis);


        btnDespesasFixas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(TelaDespesas.this, TelaDespesasFixas.class);
                startActivity(in);
            }
        });
        btnDespesasVariaveis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(TelaDespesas.this, TelaDespesasVariaveis.class);
                startActivity(in);
            }
        });
    }
}