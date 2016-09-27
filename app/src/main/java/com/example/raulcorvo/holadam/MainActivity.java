package com.example.raulcorvo.holadam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main); //Al estar comentada esta linea, no carga el layout 'activity_main' por lo que el texto de xml no se ve

        TextView nuevoTexto = new TextView(this);
        nuevoTexto.setText("Hola DAM desde Java");
        setContentView(nuevoTexto);
    }
}
