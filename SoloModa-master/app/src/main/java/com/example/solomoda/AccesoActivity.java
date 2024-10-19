package com.example.solomoda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AccesoActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);
    }
    public void onClickRecomendado(View view){
        Intent intent = new Intent(this, VentanaRecomendado.class);
        startActivity(intent);
    }
    public void onClickCuenta(View view){
        Intent intent = new Intent(this, VentanaCuenta.class);
        startActivity(intent);
    }
    public void onClickTiendas(View view){
        Intent intent = new Intent(this, VentanaTiendas.class);
        startActivity(intent);
    }


}
