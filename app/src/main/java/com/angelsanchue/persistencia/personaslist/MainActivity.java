package com.angelsanchue.persistencia.personaslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List <Persona> lista1 = new ArrayList<Persona>();
    private EditText resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botonAgregar = (Button)findViewById(R.id.btnagregar);


    }

    public void AgregarRegistro (View view) {
        Persona persona1 = new Persona();
        persona1.nombre = "Jorge";
        persona1.edad = 20;
        persona1.genero="M";
        lista1.add(persona1);
        resultado = (EditText) findViewById(R.id.txtResultado);
        resultado.setText(persona1.nombre);


    }
}
