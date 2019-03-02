package com.alaythiaproductions.musicapp;

public class Song {

    private String songTitle;
    private String album;
    private int albumImage;

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

    public String getAlbum() {
        return album;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public int getAlbumImage() {
        return albumImage;
    }

    public boolean hasAlbum() {
        return albumImage != NO_ALBUM_PROVIDED;
    }
}
