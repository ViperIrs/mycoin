package com.example.mycoin5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TelaOrcamento2 extends AppCompatActivity {
    TextView btnPassos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_orcamento2);
        btnPassos =findViewById(R.id.btnPassos);

        btnPassos.setOnClickListener(view -> {
            Intent in = new Intent(TelaOrcamento2.this, TelaPassos.class);
            startActivity(in);
        });
    }
}