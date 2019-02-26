package com.alaythiaproductions.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView knucklePuckTextView = (TextView)findViewById(R.id.knuckle_puck);
        TextView danceGavinDanceTextView = (TextView)findViewById(R.id.dance_gavin_dance);
        TextView emarosaTextView = (TextView)findViewById(R.id.emarosa);
        TextView foreverCameCallingTextView = (TextView)findViewById(R.id.forever_came_calling);

        knucklePuckTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KnucklePuck.class);
                startActivity(intent);
            }
        });

        danceGavinDanceTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DanceGavinDance.class);
                startActivity(intent);
            }
        });

        emarosaTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Emarosa.class);
                startActivity(intent);
            }
        });

        foreverCameCallingTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ForeverCameCalling.class);
                startActivity(intent);
            }
        });

    }
}
