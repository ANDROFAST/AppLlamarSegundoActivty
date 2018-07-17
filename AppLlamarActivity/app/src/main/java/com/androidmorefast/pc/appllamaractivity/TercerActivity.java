package com.androidmorefast.pc.appllamaractivity;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TercerActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
        ImageView imageView = (ImageView) findViewById(R.id.ivLogoLenguaje);

        Intent i = getIntent();
        int FlagId = i.getIntExtra("logo",0);
        imageView.setImageResource(FlagId);
        regresar();
    }

    public void regresar(){
        TextView regresar = (TextView) findViewById(R.id.regresar);

        String udata="Regresar al Activity 2";
        SpannableString content = new SpannableString(udata);
        content.setSpan(new UnderlineSpan(), 0, udata.length(), 0);
        regresar.setText(content);

             //hago clic y se abre el 2
           regresar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(getApplicationContext(), SegundoActivity.class);
                startActivity(ListSong);
            }
        });
    }

}