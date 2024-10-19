package com.example.solomoda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VentanaCuenta extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta);

        textView = findViewById(R.id.texto1);
        imageView = findViewById(R.id.imagenPrueba);
        progressBar = findViewById(R.id.barraProgreso);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setVisibility(View.GONE);
                        textView.setText("Imagen cargada correctamente");
                        imageView.setVisibility(View.VISIBLE);
                        imageView.setImageResource(R.drawable.logotipo);
                    }
                });
            }
        };

        thread.start();
    }

    public void onClickInicio(View view) {
        Intent intent = new Intent(this, AccesoActivity.class);
        startActivity(intent);
    }
}
