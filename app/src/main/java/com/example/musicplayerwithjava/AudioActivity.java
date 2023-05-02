package com.example.musicplayerwithjava;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AudioActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Button btnplay;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        btnplay=(Button)findViewById(R.id.btnplay);
        mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.a);
        imageView=findViewById(R.id.imageViewplay);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play();
            }
        });
    }
    public  void play(){
        if (!mediaPlayer.isPlaying()){
            mediaPlayer.start();
            btnplay.setText("PLAYING");
            imageView.setImageResource(R.drawable.ic_baseline_pause_circle_24);
        }
        else{
            mediaPlayer.pause();
            btnplay.setText("PAUSED");
            imageView.setImageResource(R.drawable.ic_baseline_play_arrow_24);

        }

    }

}
