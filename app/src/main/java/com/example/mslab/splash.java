package com.example.mslab;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {
    Handler handler;
    ImageView img;
    Runnable run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        img = findViewById(R.id.img);
        img.animate().alpha(3000).setDuration(0);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splash.this, login.class);
                startActivity(i);
                finish();

            }
        }, 3000);
    }
}
