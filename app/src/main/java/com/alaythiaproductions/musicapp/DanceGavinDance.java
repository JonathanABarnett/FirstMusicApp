package com.alaythiaproductions.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DanceGavinDance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        List<Song> songs = new ArrayList<>();

        songs.add(new Song("The Robot with Human Hair Pt. 1", "I Am Battle Ocean"));
        songs.add(new Song("The Robot with Human Hair Pt. 2", "Downtown Mountain"));
        songs.add(new Song("I am Royal Mountain", "Orange"));
        songs.add(new Song("Dance All Night", "Blue"));
        songs.add(new Song("Run All Night", "I AM Battle Ocean"));
        songs.add(new Song("The Robot with Human Hair Pt. 3", "Orange"));
        songs.add(new Song("The Robot with Human Hair Pt. 4", "Blue"));
        songs.add(new Song("Run All Night Again", "Downtown Mountain"));
        songs.add(new Song("The Robot with Human Hair Pt. 1", "I Am Battle Ocean"));
        songs.add(new Song("The Robot with Human Hair Pt. 2", "Downtown Mountain"));
        songs.add(new Song("I am Royal Mountain", "Orange"));
        songs.add(new Song("Dance All Night", "Blue"));
        songs.add(new Song("Run All Night", "I AM Battle Ocean"));
        songs.add(new Song("The Robot with Human Hair Pt. 3", "Orange"));
        songs.add(new Song("The Robot with Human Hair Pt. 4", "Blue"));
        songs.add(new Song("Run All Night Again", "Downtown Mountain"));


        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(songAdapter);

    }
}
