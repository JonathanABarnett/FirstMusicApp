package com.alaythiaproductions.musicapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class KnucklePuck extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        List<Song> songs = new ArrayList<>();

        songs.add(new Song("Orange", "Blue", R.drawable.kp1));
        songs.add(new Song("The Robot with Human Hair Pt. 2", "Downtown Mountain", R.drawable.kp1));
        songs.add(new Song("I am Royal Mountain", "Orange", R.drawable.kp1));
        songs.add(new Song("Dance All Night", "Blue", R.drawable.kp1));
        songs.add(new Song("Run All Night", "I AM Battle Ocean"));
        songs.add(new Song("The Robot with Human Hair Pt. 3", "Orange"));
        songs.add(new Song("The Robot with Human Hair Pt. 4", "Blue"));
        songs.add(new Song("Run All Night Again", "Downtown Mountain"));
        songs.add(new Song("The Robot with Human Hair Pt. 1", "I Am Battle Ocean"));
        songs.add(new Song("The Robot with Human Hair Pt. 2", "Downtown Mountain"));


        SongAdapter adapter = new SongAdapter(this, songs, R.color.color_secondary_light);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mediaPlayer = new MediaPlayer().create(KnucklePuck.this, R.raw.dgd);
                mediaPlayer.start();
            }
        });
    }
}
