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


public class Main {
    public static void main(String[] args) {
        // Instance 1: Central Cee
        Rapper centralCee = new Rapper("Central Cee", "Oakley Neil H.T Caesar-Su", "Ladbroke Grove, London, United Kingdom", 25, "33,020,746");

        System.out.println("-----Rapper 1-----");
        System.out.println("Stage Name: " + centralCee.stagename);
        System.out.println("Real Name: " + centralCee.realname);
        System.out.println("Birthplace: " + centralCee.birthplace);
        System.out.println("Age (as of 09/09/23): " + centralCee.age);
        System.out.println("Monthly Spotify Listeners (as of 09/09/23): " + centralCee.monthlyspotify);
 

        // Instance 2: NF
        Rapper nf = new Rapper("NF", "Nathan John Feuerstein", "Gladwin, Michigan, United States", 32, "16,425,498");

        System.out.println("\n-----Rapper 2-----");
        System.out.println("Stage Name: " + nf.stagename);
        System.out.println("Real Name: " + nf.realname);
        System.out.println("Birthplace: " + nf.birthplace);
        System.out.println("Age (as of 09/09/23): " + nf.age);
        System.out.println("Monthly Spotify Listeners (as of 09/09/23): " + nf.monthlyspotify);
        
        
        // Instance 3: Connor Price
        Rapper connorPrice = new Rapper("Connor Price", "Connor Price", "Toronto, Canada", 28, "7,629,058");

        System.out.println("\n-----Rapper 3-----");
        System.out.println("Stage Name: " + connorPrice.stagename);
        System.out.println("Real Name: " + connorPrice.realname);
        System.out.println("Birthplace: " + connorPrice.birthplace);
        System.out.println("Age (as of 09/09/23): " + connorPrice.age);
        System.out.println("Monthly Spotify Listeners (as of 09/09/23): " + connorPrice.monthlyspotify);

        
        // Divider
        System.out.println("\n----------\n");
        
        
        // Outputing data before the Singer (Bob) Performs
        Song favoriteSong = new Song("Jane & The Boy", "Electric", 2021, "760,021");
        Singer Bob = new Singer ("Bob Dela Cruz", favoriteSong);
        System.out.println("-----Before the Performance Data-----");
        System.out.println("Current Earnings: " + Bob.earnings);
        System.out.println("Favorite Song: " + Bob.favoriteSong.songName);
        System.out.println("> Artist: " + Bob.favoriteSong.artist);
        System.out.println("> Year Released in: " + Bob.favoriteSong.yearReleased);
        System.out.println("> No. of Spotify Streams: " + Bob.favoriteSong.spotifyStreams);
        
        // Bob performing for 12 people
        Bob.performForAudience(12);
        // Changing the Favorite Song
        Song favoriteSong2 = new Song("Lola Amour", "Raining in Manila", 2023, "48, 443, 368");
        Bob.changeFavSong(favoriteSong2);
        
        
        // Outputing data after the Singer (Bob) performed
        System.out.println("\n-----After the Performance and Favorite Song Changing Data-----");
        System.out.println("Current Earnings: " + Bob.earnings);
        System.out.println("Favorite Song: " + Bob.favoriteSong.songName);
        System.out.println("> Artist: " + Bob.favoriteSong.artist);
        System.out.println("> Year Released in: " + Bob.favoriteSong.yearReleased);
        System.out.println("> No. of Spotify Streams: " + Bob.favoriteSong.spotifyStreams);
        
        
        
        
        
    }
}
