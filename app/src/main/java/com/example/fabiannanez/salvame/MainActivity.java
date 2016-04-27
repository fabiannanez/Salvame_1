package com.example.fabiannanez.salvame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton text;
    ImageButton grabar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (ImageButton)findViewById(R.id.texto);
        grabar = (ImageButton)findViewById(R.id.audio);


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
    }
}
