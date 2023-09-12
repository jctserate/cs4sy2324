/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2_cs4photonserate;

/**
 *
 * @author PHOTON SERATE
 */
public class Song {
    String artist, songName, spotifyStreams;
    int yearReleased;
    
    public Song(String artist, String songName, int yearReleased, String spotifyStreams) {
        this.artist = artist;
        this.songName = songName;
        this.yearReleased = yearReleased;
        this.spotifyStreams = spotifyStreams;
    }
    
    
}
