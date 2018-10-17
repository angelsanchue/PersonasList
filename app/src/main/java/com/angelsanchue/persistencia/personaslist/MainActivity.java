package com.angelsanchue.persistencia.personaslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List personas = (List) new Persona();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botonAgregar = (Button)findViewById(R.id.btnagregar);


    }

    public void AgregarRegistro (View view) {



    }
}
