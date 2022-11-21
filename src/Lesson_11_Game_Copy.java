/*
      program: Black Jack Game
      Author: Noah Lowe
      Date crated: 11/10/22
      Date last modified 11/10/22
*/

import java.util.Scanner;

public class Lesson_11_Game_Copy {
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
        int playerMoney = 0;
        int computerMoney = 0;
        int playerBet = 0;
        int computerBet = 0;
        boolean playerWin = true;

        playerMoney = (int) (1000 + Math.random() * 2999.99);
        computerMoney = (int) (1000 + Math.random() * 2999.99);


        System.out.println("Welcome to Black Jack.");

        while (keepLooping) {
            Scanner scan = new Scanner(System.in);
            if (playerMoney <= 0) {
                System.out.println("You are out of money. You Lost. Thanks for playing.");
                break;
            } else if (computerMoney <= 0) {
                System.out.println("The computer is out of money. You won. Thanks for playing.");
                break;
            }

            System.out.println("Press Enter to play. Press q to exit. ");
            String userimput = scan.nextLine().toLowerCase();
            if (userimput.equals("q")) {
                System.out.println("Thank you for playing!");
                break;
            }

            round++;
            System.out.println("Round: " + round);
            System.out.print("Player Score: " + playerScore);
            System.out.println("                       Computer Score: " + computerScore);
            System.out.print("Player Money: $" + playerMoney);
            System.out.println("                   Computer Money: $" + computerMoney);
            System.out.println();
            System.out.println("What game rule do you want to play. " +
                    "(1. Cards added together after being multiple to a random power. 2. The average of the cards)");
            gameRule = scan.nextInt();

            if(gameRule != 1 && gameRule != 2) {
                gameRule = (int) (1 + Math.random() * 1.99);
                System.out.println("You imputed an invalid number to select the game rule. So a random game rule has been selected. ");
                System.out.println("The game rule chosen is: " + gameRule);
            }
            System.out.println("How much money do you want to bet? ");
            playerBet = scan.nextInt();

            if (playerBet > playerMoney) {
                playerBet = (int) (1 + Math.random() * playerMoney);
            }

            computerBet = (int) (1 + Math.random() * computerMoney);

            playerMoney = playerMoney - playerBet;
            computerMoney = computerMoney - computerBet;

            System.out.println("The player bet $" + playerBet);
            System.out.println("The computer bet $" + computerBet);

            int playerCards[] = new int[cardAmount];
            int computerCards[] = new int[cardAmount];
            int randompower1[] = new int[cardAmount];
            int randompower2[] = new int[cardAmount];

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

            System.out.print("                   The computers cards are: ");
            for (int i = 0; i < cardAmount; i++) {
                System.out.print(computerCards[i] + " ");
                if (i != computerCards.length-1){
                    System.out.print(", ");
                }

            }

            if (gameRule == 1) {
                System.out.println();
                // rule 1: the cards that add together by the power of 2 will win
                for (int i = 0; i < cardAmount; i++) {
                    randompower1[i] = (int) (1 + Math.random()* 2.99);
                    randompower2[i] = (int) (1 + Math.random()* 2.99);
                    playerCards[i] = (int)Math.pow(playerCards[i], randompower1[i]);
                    computerCards[i] = (int)Math.pow(computerCards[i], randompower2[i]);

                    playerCardsRule1 = playerCardsRule1 + playerCards[i];
                    computerCardsRule1 = computerCardsRule1 + computerCards[i];
                }
                System.out.println();
                System.out.print("Your cards to the powers of ");
                for(int i = 0; i < cardAmount; i++) {
                    System.out.print(randompower1[i] + ", ");
                }
                System.out.println("then add together are: " + playerCardsRule1);
                System.out.println();
                System.out.print("The computers cards to the power of ");
                for(int i = 0; i < cardAmount; i++) {
                    System.out.print(randompower2[i] + ", ");
                }
                System.out.println("then add together are: " + computerCardsRule1);
                System.out.println();

                if (playerCardsRule1 > computerCardsRule1) {
                    System.out.println("You win this round!");
                    System.out.print("You won because your cards added together after being calculated to the power of ");
                    for(int i = 0; i < cardAmount; i++) {
                        System.out.print(randompower1[i] + ", ");
                    }
                    System.out.println("was bigger then the computers cards.");
                    playerScore++;

                } else {
                    System.out.println("The computer win this round!");
                    System.out.print("The computer won because their cards added together after being calculated to the power of ");
                    for(int i = 0; i < cardAmount; i++) {
                        System.out.print(randompower2[i] + ", ");
                    }
                    System.out.println("was bigger then your cards.");
                    computerScore++;
                    playerWin = false;
                }
            } else if (gameRule == 2) {

                playerCardsRule2 = (playerCards[0] + playerCards[1] + playerCards[2])/cardAmount;
                computerCardsRule2 = (computerCards[0] + computerCards[1] + computerCards[2])/cardAmount;
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
                    playerWin = false;
                }

            }
            System.out.println();

            if (playerWin) {
                playerMoney = playerMoney + (playerBet + computerBet);
                System.out.println("You won $" + (playerBet + computerBet));
            } else {
                computerMoney = computerMoney + (playerBet + computerBet);
                System.out.println("The computer won $" + (playerBet + computerBet));
            }
            System.out.println();
        }
    }
}
