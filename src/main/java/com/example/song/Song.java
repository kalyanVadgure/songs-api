package com.example.song;



public class Song {
    private Integer songId;
    private String songName;
    private String lyricist;
    private String singer;
    private String musicDirector;

    public Song(int songId, String songName, String lyricist, String singer, String musicDirector) {
        this.songId = songId;
        this.songName = songName;
        this.lyricist = lyricist;
        this.singer = singer;
        this.musicDirector = musicDirector;
    }

    public Integer getSongId() {
        return this.songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return this.songName;
    }
    
    public void setSongName(String songName) {
        this.songName = songName;
    }
    
    public String getLyricist() {
        return this.lyricist;
    }
    
    public void setLyricist(String lyricist) {
        this.songName = lyricist;
    }

    public String getSinger() {
        return this.singer;
    }
    
    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getMusicDirector() {
        return this.musicDirector;
    }
    
    public void setMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }