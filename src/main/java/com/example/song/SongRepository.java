package com.example.song;

import com.example.song.Song;
import java.util.*;


public interface SongRepository {
    ArrayList<Song> getSongs();
    Song getSongById(int songId);
    Song addSong(Song song);

    Song upadateSong(int songId, Song song);
    void deleteSong(int songId);
}
