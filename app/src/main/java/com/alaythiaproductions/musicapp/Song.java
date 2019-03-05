package com.alaythiaproductions.musicapp;

public class Song {

    private String songTitle;
    private String album;
    private int albumImage;
    private int song;

    private static final int NO_ALBUM_PROVIDED = -1;

    public Song(String songTitle, String album){
        this.songTitle = songTitle;
        this.album = album;
    }

    public Song (String songTitle, String album, int albumImage) {
        this.songTitle = songTitle;
        this.album = album;
        this.albumImage = albumImage;
    }

    public Song (String songTitle, String album, int albumImage, int song) {
        this.songTitle = songTitle;
        this.album = album;
        this.albumImage = albumImage;
        this.song = song;
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

    public int getSong() { return song; }

    public boolean hasAlbum() {
        return albumImage != NO_ALBUM_PROVIDED;
    }
}
