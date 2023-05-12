package com.example.mycoin5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btnConceitos;
    TextView botaoreceita;
    TextView botaoreserva;
    TextView botaodespesa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        btnConceitos = findViewById(R.id.btnReceitas);
        botaoreceita = findViewById(R.id.botaoreceita);
        botaoreserva = findViewById(R.id.botaoreserva);
        botaodespesa = findViewById(R.id.botaodespesa);

        botaoreceita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, CalculadoraReceitas.class);
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

    }

    public void TelaConceitos(View view) {
        Intent in = new Intent(MainActivity.this, TelaConceitos.class);
        startActivity(in);
    }
}