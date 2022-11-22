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
        int playerMoney = 0;
        int computerMoney = 0;
        int playerBet = 0;
        int computerBet = 0;
        boolean playerWin = true;

        // Adds a random amount of money to the players and computers bank

        playerMoney = (int) (1000 + Math.random() * 2999.99);
        computerMoney = (int) (1000 + Math.random() * 2999.99);


        System.out.println("Welcome to Black Jack.");

        while (keepLooping) {
            Scanner scan = new Scanner(System.in);  // need re-initialize the scanner otherwise the second loop will
                                                    // not pickup the q input

            if (playerMoney <= 0) { // If the player or computer runs out of money the game ends
                System.out.println("You are out of money. You Lost. Thanks for playing.");
                break;
            } else if (computerMoney <= 0) {
                System.out.println("The computer is out of money. You won. Thanks for playing.");
                break;
            }

            System.out.println("Press Enter to play. Press q to exit. "); // user inputs if they want to continue of not
            String userInput = scan.nextLine().toLowerCase();
            if (userInput.equals("q")) {
                System.out.println("Thank you for playing!");
                break;
            }
            gameRule = (int) (1 + Math.random() * 1.99); // choose what game rule will be in effect for this round

            round++;
            System.out.println("Round: " + round); // round number
            System.out.print("Player Score: " + playerScore); // player score
            System.out.println("                       Computer Score: " + computerScore); // computer score
            System.out.print("Player Money: $" + playerMoney); // player money
            System.out.println("                   Computer Money: $" + computerMoney); // computer money
            System.out.println();
            System.out.println("Game Rules. 1: Cards added together after being multiple to a random power. 2: The average of the cards."); // explaining the game rules
            System.out.println("The game rule chosen is: " + gameRule);

            System.out.println("How much money do you want to bet? ");
            playerBet = scan.nextInt();

            while (playerBet > playerMoney) {
                System.out.println("You do not have the money for this bet. Reenter a new bet: "); // player bets
                playerBet = scan.nextInt();
            }

            computerBet = (int) (1 + Math.random() * computerMoney); // computer bets

            playerMoney = playerMoney - playerBet;
            computerMoney = computerMoney - computerBet;

            System.out.println("The player bet $" + playerBet); // outputs the players bet
            System.out.println("The computer bet $" + computerBet); // outputs the computers bet

            int playerCards[] = new int[cardAmount]; // states the amount of cards the player will get
            int computerCards[] = new int[cardAmount]; // states the amount of cards the computer will get
            int randomPower1[] = new int[cardAmount]; // states many different powers are going to be used to the player
            int randomPower2[] = new int[cardAmount]; // states many different powers are going to be used to the computer

            for (int i = 0; i < cardAmount; i++) {
                int playerCardNum = (int) (5 + Math.random()* 14.99); // chooses the players cards
                int computerCardNum = (int) (5 + Math.random()* 14.99); // chooses the computer cards
                playerCards[i] = playerCardNum; // states the players cards
                computerCards[i] = computerCardNum; // states the computers cards
            }

            System.out.print("Your cards are: "); // outputs the player cards
            for (int i = 0; i < cardAmount; i++) {
                System.out.print(playerCards[i] + ", ");
            }

            System.out.print("                   The computers cards are: "); // outputs the computers cards
            for (int i = 0; i < cardAmount; i++) {
                System.out.print(computerCards[i] + ", ");

            }

            if (gameRule == 1) {
                System.out.println();
                // rule 1: the cards that add together by the power of 2 will win
                for (int i = 0; i < cardAmount; i++) {
                    // chooses the random powers
                    randomPower1[i] = (int) (1 + Math.random()* 2.99);
                    randomPower2[i] = (int) (1 + Math.random()* 2.99);
                    // calculates the player's cards to the random powers
                    playerCards[i] = (int)Math.pow(playerCards[i], randomPower1[i]);
                    computerCards[i] = (int)Math.pow(computerCards[i], randomPower2[i]);
                    // adds the calculated numbers together
                    playerCardsRule1 = playerCardsRule1 + playerCards[i];
                    computerCardsRule1 = computerCardsRule1 + computerCards[i];
                }
                System.out.println();
                System.out.print("Your cards to the powers of "); // outputs the powers that the players cards will be calculated to
                for(int i = 0; i < cardAmount; i++) {
                    System.out.print(randomPower1[i] + ", ");
                }
                System.out.println("then add together are: " + playerCardsRule1); // the calculated number
                System.out.println();
                System.out.print("The computers cards to the power of "); // outputs the powers that the computers cards will be calculated to
                for(int i = 0; i < cardAmount; i++) {
                    System.out.print(randomPower2[i] + ", ");
                }
                System.out.println("then add together are: " + computerCardsRule1);
                System.out.println();

                if (playerCardsRule1 > computerCardsRule1) { // if the player wins
                    System.out.println("You win this round!");
                    System.out.print("You won because your cards added together after being calculated to the power of ");
                    for(int i = 0; i < cardAmount; i++) {
                        System.out.print(randomPower1[i] + ", ");
                    }
                    System.out.println("was bigger then the computers cards.");
                    playerScore++;

                } else { // if the computer wins
                    System.out.println("The computer win this round!");
                    System.out.print("The computer won because their cards added together after being calculated to the power of ");
                    for(int i = 0; i < cardAmount; i++) {
                        System.out.print(randomPower2[i] + ", ");
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

