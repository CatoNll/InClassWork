/*
      program: Black Jack Game
      Author: Noah Lowe
      Date crated: 11/10/22
      Date last modified 11/10/22
*/

import java.util.Scanner;

public class Lesson_10b_Game {
    public static void main(String[] args) throws InterruptedException {
        int cardAmount = 3;
        int userCards = 0;
        int userCardAmount = 0;
        int computerCards = 0;
        int computerCardAmount = 0;
        int userScore = 0;
        int computerScore = 0;
        int roundNum = 0;
        boolean keepLooping = true;

        Scanner scan = new Scanner(System.in);
        while (keepLooping) {
            System.out.println("Welcome to Black Jack. Press enter to continue or enter q to exit");
            String userImput = scan.nextLine().toLowerCase();

            if (userImput.equals("q")) {
                System.out.println("Thanks for playing Black Jack.");
                break;
            }
            for (int i = 0; i < cardAmount; ++i) {
                userCards = (int) Math.round(0.5 + Math.random() * 10);
                System.out.println("Your card is: " + userCards);
                userCardAmount = userCardAmount + userCards;
            }
            System.out.println("The total of your cards is: " + userCardAmount);
            System.out.println();
            Thread.sleep(500);

            for (int i = 0; i < cardAmount; ++i) {
                computerCards = (int) Math.round(0.5 + Math.random() * 10);
                System.out.println("Your card is: " + computerCards);
                computerCardAmount = computerCardAmount + cardAmount;
            }
            System.out.println("The total of your cards is: " + computerCardAmount);

            if (userCardAmount > computerCardAmount) {
                System.out.println("The player wins!!!!");
            }

        }
    }
}
