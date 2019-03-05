package com.alaythiaproductions.musicapp;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
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

    private AudioManager audioManager;

    private AudioManager.OnAudioFocusChangeListener audioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                mediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                releaseMediaPlayer();
            }
        }
    };

    private OnCompletionListener completionListener = new OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        final List<Song> songs = new ArrayList<>();

        songs.add(new Song("Orange", "Blue", R.drawable.kp1, R.raw.dgd));
        songs.add(new Song("The Robot with Human Hair Pt. 2", "Downtown Mountain", R.drawable.kp1, R.raw.dgd));
        songs.add(new Song("I am Royal Mountain", "Orange", R.drawable.kp1, R.raw.dgd));
        songs.add(new Song("Dance All Night", "Blue", R.drawable.kp1, R.raw.dgd));
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
                releaseMediaPlayer();
                Song song = songs.get(position);
                int result = audioManager.requestAudioFocus(audioFocusChangeListener,
                        AudioManager.STREAM_MUSIC,
                        AudioManager.AUDIOFOCUS_GAIN);

                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    mediaPlayer = MediaPlayer.create(KnucklePuck.this, song.getSong());
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(completionListener);
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();

            mediaPlayer = null;

            audioManager.abandonAudioFocus(audioFocusChangeListener);
        }
    }
}
