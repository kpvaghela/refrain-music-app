package com.android4dev.navigationview;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app. Activity;

public class SplashActivity extends AppCompatActivity {
    public static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // This method will be executed once the timer is over

                Intent i = new Intent(SplashActivity.this, Login.class);
                startActivity(i);
                finish();
                // close this activity

            }
        }, SPLASH_TIME_OUT);



    }
    }

