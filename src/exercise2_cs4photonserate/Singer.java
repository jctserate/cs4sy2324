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
public class Singer {
    String name;
    Song favoriteSong;
    int noOfPerformances = 0;
    double earnings = 0;
    
    public Singer(String name, Song favoriteSong) {
        this.name = name;
        this.favoriteSong = favoriteSong;   
    }
    
    public void performForAudience(int noOfPeople) {
        noOfPerformances++;
        this.earnings += 100*noOfPeople;
    }
    
    public void changeFavSong(Song newSong) {
        this.favoriteSong = newSong;
    }
}
