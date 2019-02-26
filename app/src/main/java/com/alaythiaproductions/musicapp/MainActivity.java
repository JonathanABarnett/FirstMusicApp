package com.alaythiaproductions.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openKnucklePuck(View view) {
        Intent intent = new Intent(MainActivity.this, KnucklePuck.class);
        startActivity(intent);
    }

    public void openDanceGavinDance(View view){
        Intent intent = new Intent(MainActivity.this, DanceGavinDance.class);
        startActivity(intent);
    }

    public void openForeverCameCalling(View view){
        Intent intent = new Intent(MainActivity.this, ForeverCameCalling.class);
        startActivity(intent);
    }

    public void openEmarosa(View view){
        Intent intent = new Intent(MainActivity.this, Emarosa.class);
        startActivity(intent);
    }
}
