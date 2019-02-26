package com.alaythiaproductions.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DanceGavinDance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance_gavin_dance);

        List<String> songs = new ArrayList<>();

        songs.add("The Robot with Human Hair Pt. 1");
        songs.add("The Robot with Human Hair Pt. 2");
        songs.add("I am Royal Mountain");
        songs.add("Dance All Night");
        songs.add("Run All Night");
        songs.add("The Robot with Human Hair Pt. 3");
        songs.add("The Robot with Human Hair Pt. 4");
        songs.add("Run All Night Again");
        songs.add("Boogy");
        songs.add("Machine Thoughts");
        songs.add("You're Never Safe");
        songs.add("Brink of Escape");
        songs.add("Dance Dance");
        songs.add("The Robot with Human Hair Pt. 1");
        songs.add("The Robot with Human Hair Pt. 2");
        songs.add("I am Royal Mountain");
        songs.add("Dance All Night");
        songs.add("Run All Night");
        songs.add("The Robot with Human Hair Pt. 3");
        songs.add("The Robot with Human Hair Pt. 4");
        songs.add("Run All Night Again");
        songs.add("Boogy");
        songs.add("Machine Thoughts");
        songs.add("You're Never Safe");
        songs.add("Brink of Escape");
        songs.add("Dance Dance");        songs.add("The Robot with Human Hair Pt. 1");
        songs.add("The Robot with Human Hair Pt. 2");
        songs.add("I am Royal Mountain");
        songs.add("Dance All Night");
        songs.add("Run All Night");
        songs.add("The Robot with Human Hair Pt. 3");
        songs.add("The Robot with Human Hair Pt. 4");
        songs.add("Run All Night Again");
        songs.add("Boogy");
        songs.add("Machine Thoughts");
        songs.add("You're Never Safe");
        songs.add("Brink of Escape");
        songs.add("Dance Dance");


        LinearLayout rootView = (LinearLayout)findViewById(R.id.root_view);

        for (int i = 0; i < songs.size(); i++) {
            TextView wordView = new TextView(this);
            wordView.setText(songs.get(i));
            rootView.addView(wordView);
        }

    }
}
