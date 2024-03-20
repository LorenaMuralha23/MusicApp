package com.kingcode.demo.PK;

import com.kingcode.demo.entities.Playlist;
import com.kingcode.demo.entities.Song;

import java.util.Objects;

public class SongPlaylistPK {

    private Playlist playlist;
    private Song song;

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SongPlaylistPK that = (SongPlaylistPK) o;
        return Objects.equals(playlist, that.playlist) && Objects.equals(song, that.song);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playlist, song);
    }
}
