package com.example.mycoin5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class CalculadoraReceitas extends AppCompatActivity {

    ArrayList<Float> receitas = new ArrayList<>();
    EditText EditTextReceitas;
    TextView buttonAdicionar;

    TextView TextViewReceita;

    float valorAtual = 0.00f;

    TextView TextView1;
    TextView TextView2;
    TextView TextView3;
    TextView TextView4;
    TextView TextView5;
    TextView TextView6;
    TextView TextView7;
    TextView TextView8;
    TextView TextView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_calculadora_receitas);


        EditTextReceitas = findViewById(R.id.EditTextReceitas);
        buttonAdicionar = findViewById(R.id.buttonAdicionar);
        TextView1= findViewById(R.id.TextView1);
        TextView2= findViewById(R.id.TextView2);
        TextView3= findViewById(R.id.TextView3);
        TextView4= findViewById(R.id.TextView4);
        TextView5= findViewById(R.id.TextView5);
        TextView6= findViewById(R.id.TextView6);
        TextView7= findViewById(R.id.TextView7);
        TextView8= findViewById(R.id.TextView8);
        TextView9= findViewById(R.id.TextView9);
        TextViewReceita = findViewById(R.id.TextViewReceita);
        escondertextview();
        SharedPreferences sharedPreferences = getSharedPreferences("Salvamento", Context.MODE_PRIVATE);

        valorAtual = sharedPreferences.getFloat("Receita", 0.00f);
        TextViewReceita.setText(String.valueOf(valorAtual));

        buttonAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float valor1 = Float.parseFloat(EditTextReceitas.getText().toString());


                valorAtual += valor1;

                TextViewReceita.setText(String.valueOf(valorAtual));

                receitas.add(valor1);

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putFloat("Receita", valorAtual);
                editor.apply();

                historico();
            }
        });

    }

    private void historico(){
        for(int i = 0; i < receitas.size(); i++){
            float valor = receitas.get(i);
            switch(i+1) {
                case 1:
                    TextView1.setText(String.valueOf(valor));
                    TextView1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    TextView2.setText(String.valueOf(valor));
                    TextView2.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    TextView3.setText(String.valueOf(valor));
                    TextView3.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    TextView4.setText(String.valueOf(valor));
                    TextView4.setVisibility(View.VISIBLE);
                    break;
                case 5:
                    TextView5.setText(String.valueOf(valor));
                    TextView5.setVisibility(View.VISIBLE);
                    break;
                case 6:
                    TextView6.setText(String.valueOf(valor));
                    TextView6.setVisibility(View.VISIBLE);
                    break;
                case 7:
                    TextView7.setText(String.valueOf(valor));
                    TextView7.setVisibility(View.VISIBLE);
                    break;
                case 8:
                    TextView8.setText(String.valueOf(valor));
                    TextView8.setVisibility(View.VISIBLE);
                    break;
                case 9:
                    TextView9.setText(String.valueOf(valor));
                    TextView9.setVisibility(View.VISIBLE);
                    break;
            }
        }

    }
    private void escondertextview(){

        TextView1.setVisibility(View.GONE);
        TextView2.setVisibility(View.GONE);
        TextView3.setVisibility(View.GONE);
        TextView4.setVisibility(View.GONE);
        TextView5.setVisibility(View.GONE);
        TextView6.setVisibility(View.GONE);
        TextView7.setVisibility(View.GONE);
        TextView8.setVisibility(View.GONE);
        TextView9.setVisibility(View.GONE);
    }
}