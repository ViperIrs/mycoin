package com.example.mycoin5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TelaOrcamento extends AppCompatActivity {
    EditText btnPassos;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_orcamento);

        btnPassos = findViewById(R.id.btnPassos);

        btnPassos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(TelaOrcamento.this, TelaReceitas.class);
                startActivity(in);
            }
        });
    }
}