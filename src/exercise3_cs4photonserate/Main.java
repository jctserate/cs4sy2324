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


public class Main {
    public static void main(String[] args) {
        // Instance 1: Central Cee
        Rapper centralCee = new Rapper("Central Cee", "Oakley Neil H.T Caesar-Su", "Ladbroke Grove, London, United Kingdom", 25, "33,020,746");

        System.out.println("-----Rapper 1-----");
        System.out.println("Stage Name: " + centralCee.getStagename());
        System.out.println("Real Name: " + centralCee.getRealname());
        System.out.println("Birthplace: " + centralCee.getBirthplace());
        System.out.println("Age (as of 09/09/23): " + centralCee.getAge());
        System.out.println("Monthly Spotify Listeners (as of 09/09/23): " + centralCee.getMonthlyspotify());
 

        // Instance 2: NF
        Rapper nf = new Rapper("NF", "Nathan John Feuerstein", "Gladwin, Michigan, United States", 32, "16,425,498");

        System.out.println("\n-----Rapper 2-----");
        System.out.println("Stage Name: " + nf.getStagename());
        System.out.println("Real Name: " + nf.getRealname());
        System.out.println("Birthplace: " + nf.getBirthplace());
        System.out.println("Age (as of 09/09/23): " + nf.getAge());
        System.out.println("Monthly Spotify Listeners (as of 09/09/23): " + nf.getMonthlyspotify());
        
        
        // Instance 3: Connor Price
        Rapper connorPrice = new Rapper("Connor Price", "Connor Price", "Toronto, Canada", 28, "7,629,058");

        System.out.println("\n-----Rapper 3-----");
        System.out.println("Stage Name: " + connorPrice.getStagename());
        System.out.println("Real Name: " + connorPrice.getRealname());
        System.out.println("Birthplace: " + connorPrice.getBirthplace());
        System.out.println("Age (as of 09/09/23): " + connorPrice.getAge());
        System.out.println("Monthly Spotify Listeners (as of 09/09/23): " + connorPrice.getMonthlyspotify());

        
        // Divider
        System.out.println("\n----------\n");
        
        
        // Making favorite song and singer instances
        Song favoriteSong = new Song("Jane & The Boy", "Electric", 2021, "760,021");
        Song favoriteSong2 = new Song("Lola Amour", "Raining in Manila", 2023, "48, 443, 368");
        Song favoriteSong3 = new Song("HONNE, Georgia", "Location Unknown", 2018, "148,129,697");
        
        Singer Bob = new Singer("Bob Dela Cruz", favoriteSong);
        Singer Juan = new Singer("Juan Garcia", favoriteSong3);
        
        
        // Outputing data before the Singer (Bob) Performs
        System.out.println("-----Before Bob's 1st Performance (12 people in audience) Data-----");
        System.out.println("Bob's Earnings: " + Bob.getEarnings());
        System.out.println("Bob's Current Favorite Song: " + Bob.getFavoriteSong().getSongName());
        System.out.println("> Artist: " + Bob.getFavoriteSong().getArtist());
        System.out.println("> Year Released in: " + Bob.getFavoriteSong().getYearReleased());
        System.out.println("> No. of Spotify Streams: " + Bob.getFavoriteSong().getSpotifyStreams());
        System.out.println("Number of Performances: " + Bob.getNoOfPerformances());
        
        // Bob performing for 12 people
        Bob.performForAudience(12);
        
        // Changing the Favorite Song
        Bob.changeFavSong(favoriteSong2);
        
        // Outputing data after the Singer (Bob) performed
        System.out.println("\n-----After Bob's 1st Performance (12 people in audience) and Favorite Song Change Data-----");
        System.out.println("Bob's Earnings: " + Bob.getEarnings());
        System.out.println("Bob's Current Favorite Song: " + Bob.getFavoriteSong().getSongName());
        System.out.println("> Artist: " + Bob.getFavoriteSong().getArtist());
        System.out.println("> Year Released in: " + Bob.getFavoriteSong().getYearReleased());
        System.out.println("> No. of Spotify Streams: " + Bob.getFavoriteSong().getSpotifyStreams());
        System.out.println("Number of Performances: " + Bob.getNoOfPerformances());
        
        
        // Bob partners with Juan for a performance for 12 people 
        Bob.performForAudience(12,Juan);
        
        // Outputing data after Bob performs with Juan
        System.out.println("\n-----After Bob and Juan Perform Together (12 people in audience) Data-----");
        System.out.println("Bob's Current Earnings: " + Bob.getEarnings());
        System.out.println("Bob's Number of Performances: " + Bob.getNoOfPerformances());
        
        System.out.println("\nJuan's Current Earnings: " + Juan.getEarnings());
        System.out.println("Juan's Number of Performance: " + Juan.getNoOfPerformances());
        
        System.out.println("\nTotal Number of Performances: " + Singer.getTotalPerformances());
        
        

        
        
        
        
        
    }
}