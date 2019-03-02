package com.alaythiaproductions.musicapp;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {

    private int backgroundColorId;

    public SongAdapter(Activity context, List<Song> songs, int backgroundColorId){
        super(context, 0, songs);
        this.backgroundColorId = backgroundColorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemVIew = convertView;

        if(listItemVIew == null){
            listItemVIew = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songTitle = (TextView)listItemVIew.findViewById(R.id.song_title);
        songTitle.setText(currentSong.getSongTitle());

        TextView album = (TextView)listItemVIew.findViewById(R.id.album);
        album.setText(currentSong.getAlbum());

        ImageView albumImage = (ImageView)listItemVIew.findViewById(R.id.album_image);

        if (currentSong.hasAlbum()) {

            albumImage.setImageResource(currentSong.getAlbumImage());
            albumImage.setVisibility(View.VISIBLE);

        } else {
            albumImage.setVisibility(View.GONE);
        }

        View textContainer = listItemVIew.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), backgroundColorId);
        textContainer.setBackgroundColor(color);

        return listItemVIew;
    }

}
