package com.example.fabiannanez.salvame;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton text;
    ImageButton grabar;
    ImageButton enviarAutomaticamente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String path = Environment.getExternalStorageDirectory()+"/rec.3gp";

        text = (ImageButton)findViewById(R.id.texto);
        grabar = (ImageButton)findViewById(R.id.audio);
        enviarAutomaticamente = (ImageButton)findViewById(R.id.ayuda);


        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent text = new Intent(getApplicationContext(),Msm.class);
                startActivities(new Intent[]{text});
            }
        });

        grabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent audio = new Intent(getApplicationContext(),audio.class);
                startActivities(new Intent[]{audio});

            }
        });

        enviarAutomaticamente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"MENSAJE ENVIADO"+enviarAutomaticamente.getId(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
