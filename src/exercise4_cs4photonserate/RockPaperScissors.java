
package exercise4_cs4photonserate;
import java.util.Scanner;


public class RockPaperScissors{
    public static void main(String[] args){
        
        // Scan object for accepting user inputs
        Scanner scan = new Scanner(System.in);
        
        // Move class objects
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");

        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);

        int roundsToWin = 2; // This is the default number of wins to win a match

        boolean menuRun = true; // Tells us whether to run the program menu again 
        int menuChoice = 0; // Will hold the user's move of choice in the menu
        
        int computerWins = 0, playerWins = 0; // No. of wins of the player and computer per match
        boolean gameOngoing = false; // Tells us if the game is ongoing and if we should run another round
        
        int playerMoveChoice = 0; // Will hold the user's choice in the game (Rock, Paper, or Scissors) [Possible choices: 1,2,3] 
        int random = 0; // Will hold the random move choice for the computer [Possible choices: 1,2,3]
        
        String playerWord = null; // Will hold the word equivalent of the player's choice in the game: "Rock", "Paper", "Scissors":
        String computerWord = null; // Will hold the word equivalent of the player's choice in the game: "Rock", "Paper", "Scissors":
       
        
        while (menuRun) {
            System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option: ");
            System.out.println("1. Start game");
            System.out.println("2. Change number of rounds");
            System.out.println("3. Exit application");
            menuChoice = Integer.parseInt(scan.nextLine());
            
            switch (menuChoice) {
                // User chooses to play the game:
                case 1:
                    // Resetting the computer and player wins before the next game starts
                    computerWins = 0; 
                    playerWins = 0; 
                    gameOngoing = true;
                    
                    System.out.printf("\nThis match will be first to %d wins.", roundsToWin);
                    while (gameOngoing) {
                        Move playerMove = new Move("");
                        Move computerMove = new Move ("");
                        
                        // Randomizes a choice for the computer
                        random = (int) Math.floor(Math.random()*3) + 1;
                        switch (random) {
                            case 1:
                                computerMove = rock;
                                computerWord = "Rock";
                                break;
                                
                            case 2:
                                computerMove = paper;
                                computerWord = "Paper";
                                break;
                                
                            case 3:
                                computerMove = scissors;
                                computerWord = "Scissors";
                                break;
                        }
                        
                        // Prompts the user to choose a move
                        System.out.println("\nThe computer has selected its move. Select your move:"); 
                        System.out.println("1. Rock");
                        System.out.println("2. Paper");
                        System.out.println("3. Scissors");
                        
                        playerMoveChoice = Integer.parseInt(scan.nextLine());
                        
                        switch (playerMoveChoice) {
                            case 1:
                                playerMove = rock;
                                playerWord = "Rock";
                                break;
                                
                            case 2:
                                playerMove = paper;
                                playerWord = "Paper";
                                break;
                                
                            case 3:
                                playerMove = scissors;
                                playerWord = "Scissors";
                                break;
                                
                            default:
                                System.out.println("\n***That is not a valid choice. Please try again.***");
                        }
                            

                        // Displays the results of the round
                        switch(Move.compareMoves(playerMove, computerMove)) {
                            case 0: 
                                playerWins++;
                                System.out.printf("\nPlayer chose %s. Computer chose %s. Player wins round!", playerWord, computerWord);
                                break;
                                
                            case 1:
                                computerWins++;
                                System.out.printf("\nPlayer chose %s. Computer chose %s. Computer wins round!", playerWord, computerWord);
                                break;
                                
                            case 2:
                                System.out.printf("\nPlayer chose %s. Computer chose %s. Round is tied!", playerWord, computerWord);
                                break;
                                
                            default:
                                System.out.println("Error. Something went wrong.");
                        }
                        
                        // Displays the current scoreboard
                        System.out.printf("\nPlayer: %d - Computer %d", playerWins, computerWins);
                        
                        // Displays the final results of the entire match
                        if (playerWins == roundsToWin) {
                            System.out.println("\n\nPlayer wins!\n\n----------\n");
                            gameOngoing = false;
                        } else if (computerWins == roundsToWin) {
                            System.out.println("\n\nComputer wins!\n\n----------\n");
                            gameOngoing = false;
                        }
                    }
                    break;
                    
                // User chooses to change the no. of points to win the match:
                case 2:
                    System.out.println("How many wins are needed to win a match?");
                    roundsToWin = Integer.parseInt(scan.nextLine());
                    break;
                
                // User chooses to exit the game:
                case 3: 
                    menuRun = false;
                    break;
                    
                default:
                    System.out.println("\nThat is not a valid input. Please try again.\n");
            }

        }
    }
}