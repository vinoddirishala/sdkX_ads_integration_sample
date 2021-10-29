package com.vd.rnd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.adview.general.AdLoadCallback;
import com.greedygame.core.adview.general.GGAdview;
import com.greedygame.core.models.general.AdErrors;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity implements AdLoadCallback {

    GGAdview ggAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize the GreedyGame SDK with AppConfig
        AppConfig appConfig = new AppConfig.Builder(this)
                .withAppId("62989716")
                .build();

        GreedyGameAds.initWith(appConfig,null);

        setContentView(R.layout.activity_main);




        ggAdView = findViewById(R.id.ggAdView);
        ggAdView.loadAd(this);

    }

    @Override
    public void onReadyForRefresh() {
        Log.d("GGADS","Ad Ready for refresh");
    }
    @Override
    public void onUiiClosed() {
        Log.d("GGADS","Uii closed");
    }
    @Override
    public void onUiiOpened() {
        Log.d("GGADS","Uii Opened");
    }
    @Override
    public void onAdLoadFailed (AdErrors cause) {
        Log.d("GGADS","Ad Load Failed "+cause);
    }
    @Override
    public void onAdLoaded() {
        Log.d("GGADS","Ad Loaded");
    }
}