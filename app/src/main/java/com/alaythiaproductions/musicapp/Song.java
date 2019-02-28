package com.alaythiaproductions.musicapp;

public class Song {

    public String songTitle;
    public String album;
    public int albumImage = R.drawable.ic_launcher_background;

    public Song(String songTitle, String album){
        this.songTitle = songTitle;
        this.album = album;
    }

    public Song (String songTitle, String album, int albumImage) {
        this.songTitle = songTitle;
        this.album = album;
        this.albumImage = albumImage;
    }

    public String getAlbum() {
        return album;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public int getAlbumImage() {
        return albumImage;
    }
}
