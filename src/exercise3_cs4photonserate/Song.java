/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3_cs4photonserate;

/**
 *
 * @author PHOTON 25 SERATE
 */
public class Song {
    private String artist, songName, spotifyStreams;
    private int yearReleased;
    
    public Song(String artist, String songName, int yearReleased, String spotifyStreams) {
        this.artist = artist;
        this.songName = songName;
        this.yearReleased = yearReleased;
        this.spotifyStreams = spotifyStreams;
    }

    
    
    // ----- Getters -----
    public String getArtist() {
        return artist;
    }
    public String getSongName() {
        return songName;
    }
    public String getSpotifyStreams() {
        return spotifyStreams;
    }
    public int getYearReleased() {
        return yearReleased;
    }
    
    
    // ----- Setters -----
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setSongName(String songName) {
        this.songName = songName;
    }
    public void setSpotifyStreams(String spotifyStreams) {
        this.spotifyStreams = spotifyStreams;
    }
    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }
    
    
    
}
