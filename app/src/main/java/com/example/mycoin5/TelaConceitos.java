package com.example.mycoin5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaConceitos extends AppCompatActivity {
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_conceitos);
        getSupportActionBar().hide();
        ImageView logo = findViewById(R.id.logo);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(TelaConceitos.this, MainActivity.class);
                startActivity(in);
            }
        });
    }
}