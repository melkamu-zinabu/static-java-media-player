package com.example.musicplayerwithjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //show the activity in full screen OR HIDE status bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splashscreen);
        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               /* this will execute after 4000 sec
                on_boarding_screen =getSharedPreferences("on_boarding_screen",MODE_PRIVATE) ;
                Boolean is_first_time=on_boarding_screen.getBoolean("first_time",true);
                if(is_first_time){
                    SharedPreferences.Editor editor=on_boarding_screen.edit();
                    editor.putBoolean("first_time",false);
                    editor.commit();
                    startActivity(new Intent(SplashScreen.this,LoginActivity.class));
                    finish();
                }
                */

                // else{
                startActivity(new Intent(getApplicationContext(),ManuActivity.class));
                finish();
                // }

            }
        },2000);

    }
}