package com.example.kematzib.appdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listViewContacts = (ListView) findViewById(R.id.listViewContacts);

        String[] datosContactos = new String[] {"JUAN", "PEDRO","MARCOS", "JULIO"};

        /*ADAPTADOR con diseño del item y el texto que cambia, y el grupo de datos
        * R. objetos que se auto generan por android
        * texti1 es ls lista que voy a listar */
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,
                android.R.id.text1,datosContactos);

        listViewContacts.setAdapter(adapter);
    }
}
