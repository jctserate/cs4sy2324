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
public class Singer {
    
    private static int totalPerformances = 0;
    private String name;
    private Song favoriteSong;
    private int noOfPerformances = 0;
    private double earnings = 0;
    
    public Singer(String name, Song favoriteSong) {
        this.name = name;
        this.favoriteSong = favoriteSong;   
    }
    
    public void performForAudience(int noOfPeople) {
        setTotalPerformances(getTotalPerformances() + 1);
        this.setNoOfPerformances(this.getNoOfPerformances() + 1);
        this.setEarnings(this.getEarnings() + 100*noOfPeople);
    }
    
    public void performForAudience(int noOfPeople, Singer partner) {
        setTotalPerformances(getTotalPerformances() + 1);
        this.setNoOfPerformances(this.getNoOfPerformances() + 1);
        partner.setNoOfPerformances(partner.getNoOfPerformances() + 1);
        
        this.setEarnings(this.getEarnings() + 50*noOfPeople);
        partner.setEarnings(partner.getEarnings() + 50*noOfPeople);
                
    }
    
    public void changeFavSong(Song newSong) {
        this.setFavoriteSong(newSong);
    }

    
    
    // ----- Getters -----
    public static int getTotalPerformances() {
        return totalPerformances;
    }
    public String getName() {
        return name;
    }
    public Song getFavoriteSong() {
        return favoriteSong;
    }
    public int getNoOfPerformances() {
        return noOfPerformances;
    }
    public double getEarnings() {
        return earnings;
    }
    
    
    // ----- Setters -----
    public static void setTotalPerformances(int aTotalPerformances) {
        totalPerformances = aTotalPerformances;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFavoriteSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
    public void setNoOfPerformances(int noOfPerformances) {
        this.noOfPerformances = noOfPerformances;
    }
    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
}
