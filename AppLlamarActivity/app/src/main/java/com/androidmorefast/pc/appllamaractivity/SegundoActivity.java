package com.androidmorefast.pc.appllamaractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class SegundoActivity extends AppCompatActivity {

    //Definimos el ListView
    private ListView listView;
    //Elementos que se mostraran en el listview
    private String lenguajeProgramacion[]=new String[]{"FACEBOOK","WHATSAPP","SKYPE","SNAPCHAT","TWITTER","YOUTUBE"};


    //Array de las imagenes
    private int[] LogoId = new int[]{R.drawable.facebook,
                                     R.drawable.whatsapp,
                                     R.drawable.skype,
                                     R.drawable.snapchat,
                                     R.drawable.twitter,
                                     R.drawable.youtube};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        controlador();
    }
    public void controlador() {
        //Conectamos miLista a mi ListView
        listView = (ListView) findViewById(R.id.listClick);

        //Declaramos el Array Adactes,le pasamos el contexto, le indicamos para que tenga
        // una simple_expandable_list_item_1 y le damos nuestro Array de String
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1, lenguajeProgramacion);

        //Le asignamos el adacter al listView
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // La posición donde se hace clic en el elemento de lista se obtiene de la
                // la posición de parámetro de la vista de lista de Android
                int posicion = position;

                //obtengo el valor del string del elemento donde se hizo clic
                String itemValue = (String) listView.getItemAtPosition(position);

                //Con el fin de empezar a mostrar una nueva actividad lo que necesitamos es una intención
                Intent intent = new Intent(getApplicationContext(),TercerActivity.class);

                // Poner el Id de la imagen como extra en la intención
                intent.putExtra("logo",LogoId[position]);

                // Aquí pasaremos el parámetro de la intención creada previamente
                startActivity(intent);
            }
        });

    }


}