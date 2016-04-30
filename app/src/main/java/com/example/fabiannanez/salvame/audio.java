package com.example.fabiannanez.salvame;

import android.content.Intent;
import android.media.MediaRecorder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class audio extends AppCompatActivity {

   ImageButton grabacion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        grabacion= (ImageButton) findViewById(R.id.grabar);

      grabacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaRecorder recorder = new MediaRecorder();
                recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
                recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
                recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
                //recorder.setOutputFile(PATH_NAME);
                //recorder.prepare();
                recorder.start();

            }
        });
    }



}
