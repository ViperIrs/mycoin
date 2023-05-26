package com.example.mycoin5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraReceitas extends AppCompatActivity {
    private EditText EditTextReceitas;
    private TextView buttonAdicionar;

    TextView TextViewReceita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_receitas);

        EditTextReceitas = findViewById(R.id.EditTextReceitas);
        buttonAdicionar = findViewById(R.id.buttonAdicionar);
        TextViewReceita = findViewById(R.id.TextViewReceita);

        buttonAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor = EditTextReceitas.getText().toString();
                TextViewReceita.setText(valor);
            }
        });
    }
}