package com.example.mycoin5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CalculadoraDespesas extends AppCompatActivity {

    ArrayList<Float> despesa = new ArrayList<>();
    TextView ButtonAdicionar;
    TextView TextViewDespesa;
    EditText EditTextDespesas;

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
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_calculadora_despesas);

        TextViewDespesa = findViewById(R.id.TextViewDespesa);
        ButtonAdicionar = findViewById(R.id.ButtonAdicionar);
        TextView1= findViewById(R.id.TextView1);
        TextView2= findViewById(R.id.TextView2);
        TextView3= findViewById(R.id.TextView3);
        TextView4= findViewById(R.id.TextView4);
        TextView5= findViewById(R.id.TextView5);
        TextView6= findViewById(R.id.TextView6);
        TextView7= findViewById(R.id.TextView7);
        TextView8= findViewById(R.id.TextView8);
        TextView9= findViewById(R.id.TextView9);
        EditTextDespesas = findViewById(R.id.EditTextDespesas);
        escondertextview();
        SharedPreferences sharedPreferences = getSharedPreferences("Salvamento", Context.MODE_PRIVATE);


        valorAtual = sharedPreferences.getFloat("Despesa", 0.00f);
        TextViewDespesa.setText(String.valueOf(valorAtual));

        ButtonAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float valor1 = Float.parseFloat(EditTextDespesas.getText().toString());

                valorAtual += valor1;

                TextViewDespesa.setText(String.valueOf(valorAtual));

                despesa.add(valor1);

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putFloat("Despesa", valorAtual);
                editor.apply();

                historico();
            }
        });

    }
    private void historico(){
        for(int i = 0; i < despesa.size(); i++){
            float valor = despesa.get(i);
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
