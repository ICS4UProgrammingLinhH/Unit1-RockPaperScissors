// import
import java.util.Random;
import java.util.Scanner;

/**
 * Class Rock Paper Scissors.
* This program allows user to play 
* rock paper scissors with computer

* @author  Linh Ho
* @version 1.0
* @since   2020-09-26
*/

public class RockPaperScissors {
  
  /**
    * Required javadoc.
  */
  
  // declare variables 
  static int MIN_VALUE = 1;
  static int MAX_VALUE = 3;
  
  static int playerPoints = 0;
  static int computerPoints = 0;
  
  /**
    * Required javadoc.
  */
  
  public static void main(String[] args) {
    
    // create scanner for user to put input
    Scanner userInput = new Scanner(System.in);
    
    // declare variables and constants
    int playerChoice;
    final int rock = 1;
    final int paper = 2;
    final int scissors = 3;
    
    // get the user's selection, if there is no selection set it to 0
    System.out.println("Please type a number. NOTE: 1 = rock, 2 = paper, 3 = scissors");
    
    // put user input as player choice
    playerChoice = userInput.nextInt();
    
    if (playerChoice == 1) {
      // set it to rock 
      playerChoice = rock;
    } else if (playerChoice == 2) {
      // set it to paper
      playerChoice = paper;
    } else if (playerChoice == 3) {
      // set it to scissors
      playerChoice = scissors;
    } else {
      // print error
      System.out.println("Error, type a valid answer. Please try again.");
      // restart 
      main(args);
    }
    
    // create random number generator
    Random randomNumberGenerator = new Random();
    
    // declare variable 
    int computerChoice;
    
    // Randomly generate a number between 1 and 3, 1 = rock 2 = paper, and 3 = scissors
    computerChoice = randomNumberGenerator.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;

    
    if (computerChoice == 1) {
      // set it to rock 
      computerChoice = rock;
    } else if (computerChoice == 2) {
      // set it to paper
      computerChoice = paper;
    } else {
      // set it to scissors
      computerChoice = scissors;
    } 
    
    // display what user chose
    System.out.println("You chose: " + playerChoice);
    
    // display what computer chose
    System.out.println("Computer chose: " + computerChoice);
    
    // compare the user and computer's choice to determine the winner
    // if computer chooses rock, paper or scissors compare with player's answers
    if (computerChoice == rock) {
      
      if (playerChoice == scissors) {
        
        // print you lose to the user
        System.out.println("You lose!");
        
        // increment computer points
        computerPoints++;
        
      } else if (playerChoice == paper) {
        
        // print you win
        System.out.println("You win!");
        
        // increment player points
        playerPoints++;
        
      } else {
        
        // print a tie
        System.out.println("It's a tie.");
        
        // increment both
        playerPoints++;
        computerPoints++;
      }
      
    } else if (computerChoice == paper) {
      
      if (playerChoice == paper) {
        
        // print tie
        System.out.println("It's a tie, haha.");
        
        // increment both 
        playerChoice++;
        computerChoice++;
        
      } else if (playerChoice == rock) {
        
        // print you LOSE
        System.out.println("You lose. Sorry :(");
        
        // increment points
        computerPoints++;
        
      } else {
        
        // print you win
        System.out.println("You win! YAY!!");
        
        // increment points
        playerPoints++;
      }
      
    } else {
      
      if (playerChoice == rock) {
        
        // print you win
        System.out.println("You win. Hurray!");
        
        // increment points
        playerPoints++;
        
      } else if (playerChoice == paper) {
        
        // print you lose
        System.out.println("Seems like you got caught. You lose :(");
        
        // increment points
        computerPoints++;
        
      } else {
        
        // print tie
        System.out.println("You tied with the computer. Aww.");
        
        // increment points
        computerPoints++;
        playerPoints++;
      }
    }
    
    // Display points
    System.out.println("Computer Score: " + computerPoints + " Player Score: " + playerPoints);
    
    // create scanner 
    Scanner s = new Scanner(System.in);
    
    // declare variable
    String yes; 
    String no;
    String userContinue;
    
    // Ask if they want to play still
    System.out.println("Do you want to continue to play? yes or no?");
    
    // get user input
    userContinue = s.nextLine();
    
    if (userContinue.equals("yes")) {
      // restart application
      main(args);
    } else if (userContinue.equals("no")) {
      //print thanks
      System.out.println("Thanks for playing!");
    } else {
      // error
      System.out.println("Error.");
    }
  }
}