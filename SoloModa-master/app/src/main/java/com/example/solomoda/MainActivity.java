package com.example.solomoda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaramos las Variables
    private EditText usuarioEditText;
    private EditText contrasenaEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enlazamos las variables con las id correspondientes
        usuarioEditText = findViewById(R.id.usuario);
        contrasenaEditText =  findViewById(R.id.contrasena);

    }

    public void onCLickAcceder(View view) {
        String user = usuarioEditText.getText().toString().trim();
        String pass = contrasenaEditText.getText().toString().trim();

        if(user.isEmpty()){
            Toast.makeText(this, "El campo de Usuario esta vacio", Toast.LENGTH_SHORT).show();
            return;
        }

        if(pass.isEmpty()){
            Toast.makeText(this, "El campo de Contraseña esta vacio", Toast.LENGTH_SHORT).show();
            return;
        }

        //Verificar Creedenciales
        if(user.equals("Toto")&& pass.equals("1234")){
            //Iniciar actividad
            Intent intent = new Intent(this, AccesoActivity.class);
            startActivity(intent);
        }

        else {
            Toast.makeText(this,"Creedenciales Incorrectas", Toast.LENGTH_SHORT).show();
        }
    }
}