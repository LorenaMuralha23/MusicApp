package com.kingcode.demo.entities;

import com.kingcode.demo.PK.SongPlaylistPK;

public class SongPlaylist {

    private SongPlaylistPK id = new SongPlaylistPK();

    public SongPlaylist (Playlist playlist, Song song){
        id.setPlaylist(playlist);
        id.setSong(song);
    }

    public Playlist getPlaylist(){
        return id.getPlaylist();
    }

    public void setPlaylist(Playlist playlist){
        id.setPlaylist(playlist);
    }

    public Song getSong(){
        return id.getSong();
    }

    public void setSong(Song song){
        id.setSong(song);
    }
}
