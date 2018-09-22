package com.vimal.player;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vimal.music.handler.R;

public class fullscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(fullscreen.this, Ui.class);
                fullscreen.this.startActivity(mainIntent);
                fullscreen.this.finish();
            }
        }, 2000);
    }
}