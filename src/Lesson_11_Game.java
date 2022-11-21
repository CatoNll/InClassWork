/*
      program: Black Jack Game
      Author: Noah Lowe
      Date crated: 11/10/22
      Date last modified 11/10/22
*/

import java.util.Scanner;

public class Lesson_11_Game {
    public static void main(String[] args) {


        Boolean keepLooping = true;
        int cardAmount = 3;
        int playerCardsRule1 = 0;
        int computerCardsRule1 = 0;
        int playerCardsRule2 = 0;
        int computerCardsRule2 = 0;
        int round = 0;
        int playerScore = 0;
        int computerScore = 0;
        int gameRule = 0;


        System.out.println("Welcome to Black Jack.");

        while (keepLooping) {
            Scanner scan = new Scanner(System.in);  // need re-initialize the scanner otherwise the second loop will
                                                    // not pickup the q input
            System.out.println("Press Enter to play. Press q to exit. ");

            String userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Thank you for playing!");
                break;
            }
            round++;
            System.out.println("Round: " + round);
            System.out.print("Player Score: " + playerScore);
            System.out.print(" Computer Score: " + computerScore);
            System.out.println();
            System.out.println("What game rule do you want to play. " +
                    "(1. Cards added together after being multiple to a random power. 2. The average of the cards)");
            gameRule = scan.nextInt();


            int playerCards[] = new int[cardAmount];
            int computerCards[] = new int[cardAmount];
            int randompower1[] = new int[cardAmount];
            int randompower2[] = new int[cardAmount];

            for (int i = 0; i < cardAmount; i++) {
                int playerCardNum = (int) (5 + Math.random() * 14.99);
                int computerCardNum = (int) (5 + Math.random() * 14.99);
                playerCards[i] = playerCardNum;
                computerCards[i] = computerCardNum;
            }

            System.out.print("Your cards are: ");
            for (int i = 0; i < cardAmount; i++) {
                System.out.print(playerCards[i]);
                if (i != playerCards.length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.print("                   The computers cards are: ");
            for (int i = 0; i < cardAmount; i++) {
                System.out.print(computerCards[i]);
                if (i != computerCards.length - 1) {
                    System.out.print(", ");
                }

            }


            if (gameRule == 1) {

                System.out.println();
                // rule 1: the cards that add together by the power of 2 will win
                for (int i = 0; i < cardAmount; i++) {
                    randompower1[i] = (int) (1 + Math.random() * 2.99);
                    randompower2[i] = (int) (1 + Math.random() * 2.99);
                    playerCards[i] = (int) Math.pow(playerCards[i], randompower1[i]);
                    computerCards[i] = (int) Math.pow(computerCards[i], randompower2[i]);

                    playerCardsRule1 = playerCardsRule1 + playerCards[i];
                    computerCardsRule1 = computerCardsRule1 + computerCards[i];
                }

                System.out.println();
                System.out.print("Your cards to the powers of ");
                for (int i = 0; i < cardAmount; i++) {
                    System.out.print(randompower1[i] + ", ");

                }
                System.out.println("then add together are: " + playerCardsRule1);
                System.out.println();

                System.out.print("The computers cards to the power of ");
                for (int i = 0; i < cardAmount; i++) {
                    System.out.print(randompower2[i] + ", ");

                }
                System.out.println("then add together are: " + computerCardsRule1);
                System.out.println();

                if (playerCardsRule1 > computerCardsRule1) {
                    System.out.println("You win this round!");
                    System.out.println("You won because your cards added together after being calculated to the power of ");
                    for (int i = 0; i < cardAmount; i++) {
                        System.out.print(randompower1[i] + ", ");

                    }
                    System.out.println(" was bigger then the computers cards.");
                    playerScore++;

                } else {
                    System.out.println("The computer win this round!");
                    System.out.println("The computer won because their cards added together after being calculated to the power of ");
                    for (int i = 0; i < cardAmount; i++) {
                        System.out.print(randompower2[i] + ", ");
                    }
                    System.out.println(" was bigger then your cards.");
                    computerScore++;
                }
            } else if (gameRule == 2) {

                playerCardsRule2 = (playerCards[0] + playerCards[1] + playerCards[2]) / cardAmount;
                computerCardsRule2 = (computerCards[0] + computerCards[1] + computerCards[2]) / cardAmount;
                System.out.println();
                System.out.println("The average of the players cards are: " + playerCardsRule2);
                System.out.println("The average of the computers cards are: " + computerCardsRule2);

                if (playerCardsRule1 > computerCardsRule1) {
                    System.out.println("You win this round!");
                    System.out.println("Your cards averaged together where bigger then the computers");
                    playerScore++;
                } else {
                    System.out.println("The computer wins this round!");
                    System.out.println("The computers cards averaged together where bigger then yours");
                    computerScore++;
                }
            }
            System.out.println();
            // userInput = scan.nextLine().toLowerCase();

        }
    }
}

