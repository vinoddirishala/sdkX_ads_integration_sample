package com.vd.rnd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Initialize the GreedyGame SDK with AppConfig
        AppConfig appConfig = new AppConfig.Builder(this)
                .withAppId("62989716")
                .build();

        GreedyGameAds.initWith(appConfig,null);

        runApp();

    }

    public void runApp(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this,MainActivity.class));
                finish();
            }
        },3500);
    }

}