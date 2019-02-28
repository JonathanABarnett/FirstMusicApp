package com.alaythiaproductions.musicapp;

public class Song {

    public String songTitle;
    public String album;

    public Song (String songTitle, String album) {
        this.songTitle = songTitle;
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public String getSongTitle() {
        return songTitle;
    }
}
