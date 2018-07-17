package com.androidmorefast.pc.appllamaractivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlador(); //este es el metodo que abre el layout 2
    }
    public void controlador() {

        ImageView enter = (ImageView) findViewById(R.id.enter);

//hago clic y se abre el 2
        enter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(getApplicationContext(), SegundoActivity.class);
                startActivity(ListSong);
            }
        });
    }
}
