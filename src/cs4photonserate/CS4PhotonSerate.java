/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4photonserate;

/**
*
* @author jctserate
*/
public class CS4PhotonSerate {
  /**
  * @param args the command line arguments
  */

  String sport1 = "Frisbee"; // name of sport
  double years1 = 1.5; // months playing
  String skill1 = "Advanced"; // skill level (beginner, intermediate, advanced)

  String sport2 = "Badminton"; 
  double years2 = 1.0;
  String skill2 = "Intermediate";

  String sport3 = "Volleyball"; 
  double years3 = 0.5; 
  String skill3 = "Beginner"; 
  

  
  public static void main(String[] args) {
  // TODO code application logic here
    CS4PhotonSerate sport = new CS4PhotonSerate();
    
    System.out.println("Sport 1 \nSport: " + sport.sport1 + "\nYears Playing: " + sport.years1 + "\nSkill Level: " + sport.skill1 + '\n');

    System.out.println("Sport 2 \nSport: " + sport.sport2 + "\nYears Playing: " + sport.years2 + "\nSkill Level: " + sport.skill2 + '\n');

    System.out.println("Sport 3 \nSport: " + sport.sport3 + "\nYears Playing: " + sport.years3 + "\nSkill Level: " + sport.skill3 );

    
    
    // Comparison 1: Finding the greatest value 
    System.out.print("\nI've been playing ");
    if (sport.years1 >= sport.years2) {
        if (sport.years1 >= sport.years3) {
            System.out.print(sport.sport1);
        } else {
            System.out.print(sport.sport3);
        }
        
    } else {
        if (sport.years2 >= sport.years3) {
            System.out.print(sport.sport2);
        } else {
            System.out.print(sport.sport3);
        }   
    }
    System.out.print(" for the longest time.");

    // Comparison 2: Checking if my skill level in Badminton is Beginner (Comparison)
    System.out.println("\nMy skill level in Badminton is Beginner: " + (sport.skill2 == "Beginner"));
    
    // Comparison 3: Checking if my skill level in Frisbee is the same as my skill level in Volleyball (Comparison)
    System.out.println("My skill level in Frisbee and Volleyball are the same: " + (sport.skill1 == sport.skill3));
    
    }
}
  
