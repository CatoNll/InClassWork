import java.util.Scanner;
/*
      program: At Home Assignment
      Author: Noah Lowe
      Date crated: 10/25/22
      Date last modified 10/25/22
*/

public class Lesson_8b_Assignment_Rock_Paper_Scissors
{
        public static void main (String[]args){

            boolean keepLooping = true;

            int playerScore = 0;      // Player score
            int computerScore = 0;    // Computer score
            int tieScore = 0;         // Amount of ties
            int round = 1;            // Round number
            float winLosePercent = 0F; // win/lose percentage

            Scanner scan = new Scanner(System.in);  // initialize user input collection

            System.out.println();
            System.out.println();
            System.out.println("Welcome to Rock, Paper, Scissors."); // Intro title

            while (keepLooping) {
                boolean validGame = true; // checks of the round is valid for statistics


                System.out.println();
                System.out.println("Enter r, p, or s. Enter q to exit");
                String playerInput = scan.nextLine().toLowerCase(); // scans for user input


                int computerRanNum = (int) Math.round(0.5 + Math.random() * 3.0); // Random generator for computer. 1 = rock, 2 = paper, and 3 = Scissors

                String computerPlay = null;

                switch (computerRanNum) { // converts the random number for the generator to rock, paper, or scissors
                    case 1:
                        computerPlay = "r"; // Rock
                        break;

                    case 2:
                        computerPlay = "p"; // Paper
                        break;

                    case 3:
                        computerPlay = "s"; // Scissors
                        break;
                }


                if (playerInput.equals("q")) { // exits out of the program
                    keepLooping = false;
                    validGame = false;

                    System.out.println("Thanks for playing");
                } else if (playerInput.equals("r") && computerPlay.equals("s")) { // Rock Vs Scissors

                    System.out.println("The Player Wins!!!");
                    System.out.println();
                    playerScore = playerScore + 1;

                } else if (playerInput.equals("r") && computerPlay.equals("p")) { // Rock Vs Paper

                    System.out.println("The Computer Wins!!!");
                    System.out.println();
                    computerScore = computerScore + 1;


                } else if (playerInput.equals("p") && computerPlay.equals("r")) { // Paper Vs Rock

                    System.out.println("The Player Wins!!!");
                    System.out.println();
                    playerScore = playerScore + 1;

                } else if (playerInput.equals("p") && computerPlay.equals("s")) { // Paper Vs Scissors

                    System.out.println("The Computer Wins!!!");
                    System.out.println();
                    computerScore = computerScore + 1;

                } else if (playerInput.equals("s") && computerPlay.equals("p")) { // Scissors Vs Paper

                    System.out.println("The Player Wins!!!");
                    System.out.println();
                    playerScore = playerScore + 1;


                } else if (playerInput.equals("s") && computerPlay.equals("r")) { // Scissors Vs Rock

                    System.out.println("The Computer Wins!!!");
                    System.out.println();
                    computerScore = computerScore + 1;


                } else if (playerInput.equals(computerPlay)) { // Tie game
                    System.out.println("Its a tie!!!");
                    System.out.println();
                    tieScore = tieScore + 1;

                } else { // checks for invalid inputs
                    System.out.println("You entered a wrong input. Try r, p, s, or if you want to quit enter q");
                    validGame = false;
                }

                if (validGame) {
                    winLosePercent = (playerScore / ((playerScore + computerScore) * 1f)) * 100f;   // calculates win/lose percent
                                                                                                    // tie games are not counted

                    System.out.println("Round: " + round);                        // outputs round num
                    System.out.println();

                    System.out.println("Player chooses: " + playerInput);         // Outputs player choice
                    System.out.println("The Computer chooses: " + computerPlay);  // Outputs computer choice
                    System.out.println();

                    System.out.println("The Player's Score: " + playerScore);     // Outputs player score
                    System.out.println("The Computer's Score: " + computerScore); // Outputs computer score
                    System.out.println("The Tie Score: " + tieScore);             // Outputs the number of ties
                    System.out.println("The Players win/lose percentage is: " + winLosePercent + "%"); // Outputs the win/lose percentage

                    round = round + 1; // increases the number of rounds
                }
            }
        }
}
