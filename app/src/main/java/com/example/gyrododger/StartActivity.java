package com.example.gyrododger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        MediaPlayer ring = MediaPlayer.create(StartActivity.this, R.raw.music);
        ring.start();
        ring.setLooping(true);

        Button btn_main_play = findViewById(R.id.btn_main_play);
        btn_main_play.setOnClickListener(unused -> {
            ring.stop();
            startActivityForResult(new Intent(this, GameActivity.class),1);
        });
    }
}
