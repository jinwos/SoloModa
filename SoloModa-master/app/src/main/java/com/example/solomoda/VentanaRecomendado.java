package com.example.solomoda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class VentanaRecomendado extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendado);
    }
    public void onClickInicio(View view){
        Intent intent = new Intent(this, AccesoActivity.class);
        startActivity(intent);
    }
}
