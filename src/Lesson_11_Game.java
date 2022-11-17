/*
      program: Black Jack Game
      Author: Noah Lowe
      Date crated: 11/10/22
      Date last modified 11/10/22
*/

import java.util.Scanner;

public class Lesson_11_Game {
    public static void main(String[] args) {
       /*
        int cardAmount = 3;
        int userCards = 0;
        int userCardAmount = 0;
        int computerCards = 0;
        int computerCardAmount = 0;
        int userScore = 0;
        int computerScore = 0;
        int roundNum = 0;

        */


        Scanner scan = new Scanner(System.in);
        Boolean keepLooping = true;
        int cardAmount = 0;
        int playerCardsRule1 = 0;
        int computerCardsRule1 = 0;


        System.out.println("Welcome to Black Jack. Press Enter to play. Press q to exit. ");
        String userimput = scan.nextLine().toLowerCase();

        while (keepLooping) {
            if (userimput.equals("q")) {
                System.out.println("Thank you for playing!");
                keepLooping = false;
            }
            System.out.println("How many cards do you want to play. (Recommended: 3 cards) ");
            cardAmount = scan.nextInt();

            int playerCards[] = new int[cardAmount];
            int computerCards[] = new int[cardAmount];

            for (int i = 0; i < cardAmount; i++) {
                int playerCardNum = (int) (5 + Math.random()* 14.99);
                int computerCardNum = (int) (5 + Math.random()* 14.99);
                playerCards[i] = playerCardNum;
                computerCards[i] = computerCardNum;
            }





            System.out.print("Your cards are: ");
            for (int i = 0; i < cardAmount; i++) {
                System.out.print(playerCards[i] + " ");
                if (i != playerCards.length-1){
                    System.out.print(", ");
                }
            }

            System.out.println();

            System.out.print("The computers cards are: ");
            for (int i = 0; i < cardAmount; i++) {
                System.out.print(computerCards[i] + " ");
                if (i != computerCards.length-1){
                    System.out.print(", ");
                }

            }

            System.out.println();
            // rule 1: the cards that add together by the power of 2 will win
            for (int i = 0; i < cardAmount; i++) {
                int randompower = (int) (1 + Math.random()* 2.99);
                playerCards[i] = (int)Math.pow(playerCards[i], randompower);
                computerCards[i] = (int)Math.pow(computerCards[i], randompower);

                playerCardsRule1 = playerCardsRule1 + playerCards[i];
                computerCardsRule1 = computerCardsRule1 + computerCards[i];
            }

            System.out.println("Your cards to the power of 2 then add together are: " + playerCardsRule1);
            System.out.println("The computers cards to the power of 2 then add together are: " + computerCardsRule1);
            System.out.println();


        }


    }
}

