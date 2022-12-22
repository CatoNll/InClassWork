/*
      program: Tic Tac Toe
      Author: Noah Lowe, Roni Melamed
      Date crated: 2022/12/15
      Date last modified: 2022/12/22
*/

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson_15c_Tic_Tac_Toe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String player1 = "X";
        String player2 = "O";
        int turnNum = 0;
        int round = 1;
        int player1Score = 0;
        int player2Score = 0;
        int player1Input = 0;
        int player2Input = 0;
        int checkSpot = 0;
        String playerExit = "y"; // to give them the option to quit later on

        // creating boolean variables to control while loops
        boolean keepLooping = true;
        boolean badInput1 = true;
        boolean badInput2 = true;


        // creating String array list to strong winner of each round
        ArrayList<String> winner= new ArrayList<>();

        // creating 3x3 board
        String tttBoard[][] = new String[3][3];
        System.out.println("Welcome to Tic Tac Toe. Press enter to continue");
        String enter = scan.nextLine();
        System.out.println("Player 1 is X's and Player 2 is O's");


        for (int r = 0; r < tttBoard.length; r++) {
            for (int c = 0; c < tttBoard[r].length; c++) {
                tttBoard[r][c] = " ";
            }
        }
        for (int r = 0; r < tttBoard.length; r++) {
            for (int c = 0; c < tttBoard[r].length; c++) {
                if (c == 0){
                    System.out.print(tttBoard[r][c]);
                } else {
                    System.out.print("|" + tttBoard[r][c]);
                }
            }
            System.out.println("");
            if (r != 2) {
                System.out.println("-+-+-");
            }
        }

        while (keepLooping) {
            try {
                // secondary while loop
                while (keepLooping) {

                    // resetting scanner (for when the round repeats)
                    scan = new Scanner(System.in);

            // increasing turn count every time a player goes
            turnNum += 1;
            System.out.println("Round: " + round);
            System.out.println("Turn: " + turnNum);
            System.out.println("Player 1 score: " + player1Score);
            System.out.println("Player 2 score: " + player2Score);
            System.out.println("Enter -1 to quit. ");
            System.out.println();



                    // For player 1's inputs
                    if (turnNum % 2 != 0) { // if the number of turns is odd player 1 will go
                        while (badInput1) { // If a spot on the board is taken, the player will have to reenter a new number
                            System.out.println("Player 1, choose a box (1-9): ");
                            player1Input = scan.nextInt();

                            switch (player1Input) {
                                case 1:
                                    if (tttBoard[0][0] == " ") {
                                        tttBoard[0][0] = player1;
                                        badInput1 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }

                                case 2:
                                    if (tttBoard[0][1] == " ") {
                                        tttBoard[0][1] = player1;
                                        badInput1 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }

                                case 3:
                                    if (tttBoard[0][2] == " ") {
                                        tttBoard[0][2] = player1;
                                        badInput1 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }
                                case 4:
                                    if (tttBoard[1][0] == " ") {
                                        tttBoard[1][0] = player1;
                                        badInput1 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }

                                case 5:
                                    if (tttBoard[1][1] == " ") {
                                        tttBoard[1][1] = player1;
                                        badInput1 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }
                                case 6:
                                    if (tttBoard[1][2] == " ") {
                                        tttBoard[1][2] = player1;
                                        badInput1 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }
                                case 7:
                                    if (tttBoard[2][0] == " ") {
                                        tttBoard[2][0] = player1;
                                        badInput1 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }
                                case 8:
                                    if (tttBoard[2][1] == " ") {
                                        tttBoard[2][1] = player1;
                                        badInput1 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }
                                case 9:
                                    if (tttBoard[2][2] == " ") {
                                        tttBoard[2][2] = player1;
                                        badInput1 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }
                            }
                        }
                    } else { // if the number of turns is even player 2 will go
                        while (badInput2) {
                            System.out.println("Player 2, choose a box (1-9): ");
                            player2Input = scan.nextInt();

                            switch (player2Input) {
                                case 1:
                                    if (tttBoard[0][0] == " ") {
                                        tttBoard[0][0] = player2;
                                        badInput2 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }

                                case 2:
                                    if (tttBoard[0][1] == " ") {
                                        tttBoard[0][1] = player2;
                                        badInput2 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }
                                case 3:
                                    if (tttBoard[0][2] == " ") {
                                        tttBoard[0][2] = player2;
                                        badInput2 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }
                                case 4:
                                    if (tttBoard[1][0] == " ") {
                                        tttBoard[1][0] = player2;
                                        badInput2 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }
                                case 5:
                                    if (tttBoard[1][1] == " ") {
                                        tttBoard[1][1] = player2;
                                        badInput2 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }
                                case 6:
                                    if (tttBoard[1][2] == " ") {
                                        tttBoard[1][2] = player2;
                                        badInput2 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }
                                case 7:
                                    if (tttBoard[2][0] == " ") {
                                        tttBoard[2][0] = player2;
                                        badInput2 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }
                                case 8:
                                    if (tttBoard[2][1] == " ") {
                                        tttBoard[2][1] = player2;
                                        badInput2 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }
                                case 9:
                                    if (tttBoard[2][2] == " ") {
                                        tttBoard[2][2] = player2;
                                        badInput2 = false;
                                        break;
                                    } else {
                                        System.out.println("This space it taken. Renter your number.");
                                        break;
                                    }
                            }
                        }
                    }


                    for (int r = 0; r < tttBoard.length; r++) {
                        for (int c = 0; c < tttBoard[r].length; c++) {
                            if (c == 0){
                                System.out.print(tttBoard[r][c]);
                            } else {
                                System.out.print("|" + tttBoard[r][c]);
                            }
                        }
                        System.out.println("");
                        if (r != 2) {
                            System.out.println("-+-+-");
                        }
                    }

                    scan = new Scanner(System.in);
                    // checks for every possible way of winning for player 1
                    if ((tttBoard[0][0] == player1 && tttBoard[0][1] == player1 && tttBoard[0][2] == player1) ||
                            (tttBoard[1][0] == player1 && tttBoard[1][1] == player1 && tttBoard[1][2] == player1) ||
                            (tttBoard[2][0] == player1 && tttBoard[2][1] == player1 && tttBoard[2][2] == player1) ||
                            (tttBoard[0][0] == player1 && tttBoard[1][0] == player1 && tttBoard[2][0] == player1) ||
                            (tttBoard[0][1] == player1 && tttBoard[1][1] == player1 && tttBoard[2][1] == player1) ||
                            (tttBoard[0][2] == player1 && tttBoard[1][2] == player1 && tttBoard[2][2] == player1) ||
                            (tttBoard[0][0] == player1 && tttBoard[1][1] == player1 && tttBoard[2][2] == player1) ||
                            (tttBoard[0][2] == player1 && tttBoard[1][1] == player1 && tttBoard[2][0] == player1)) {
                        System.out.println("Player 1 won this round in " + turnNum + " turns!");
                        round += 1;
                        player1Score += 1;
                        turnNum = 0; // resets the number of turns to 0 for the next round
                        for (int r = 0; r < tttBoard.length; r++) {
                            for (int c = 0; c < tttBoard[r].length; c++) {
                                tttBoard[r][c] = " ";
                            }
                        }
                        winner.add(player1);


                        System.out.println("Do you want to play an other round? y/n");
                        playerExit = scan.nextLine().toLowerCase();

                    } // checks for every possible way of winning for player 2
                    else if ((tttBoard[0][0] == player2 && tttBoard[0][1] == player2 && tttBoard[0][2] == player2) ||
                            (tttBoard[1][0] == player2 && tttBoard[1][1] == player2 && tttBoard[1][2] == player2) ||
                            (tttBoard[2][0] == player2 && tttBoard[2][1] == player2 && tttBoard[2][2] == player2) ||
                            (tttBoard[0][0] == player2 && tttBoard[1][0] == player2 && tttBoard[2][0] == player2) ||
                            (tttBoard[0][1] == player2 && tttBoard[1][1] == player2 && tttBoard[2][1] == player2) ||
                            (tttBoard[0][2] == player2 && tttBoard[1][2] == player2 && tttBoard[2][2] == player2) ||
                            (tttBoard[0][0] == player2 && tttBoard[1][1] == player2 && tttBoard[2][2] == player2) ||
                            (tttBoard[0][2] == player2 && tttBoard[1][1] == player2 && tttBoard[2][0] == player2)) {
                        System.out.println("Player 2 won this round in " + turnNum + " turns!");
                        round += 1;
                        player2Score += 1;
                        turnNum = 0;
                        for (int r = 0; r < tttBoard.length; r++) {
                            for (int c = 0; c < tttBoard[r].length; c++) {
                                tttBoard[r][c] = " ";
                            }
                        }
                        winner.add(player2);

                        System.out.println("Do you want to play an other round? y/n");
                        playerExit = scan.nextLine().toLowerCase();
                    }

                    for (int r = 0; r < tttBoard.length; r++) {
                        for (int c = 0; c < tttBoard[r].length; c++) {
                            if (tttBoard[r][c] != " ") {
                                checkSpot += 1;
                            }
                        }
                    }
                    if (checkSpot == 9) {
                        System.out.println("tie game! no winner!");
                        System.out.println("Do you want to play an other round? y/n");
                        playerExit = scan.nextLine().toLowerCase();
                        checkSpot = 0;
                        round += 1;
                        turnNum = 0; // resets the number of turns to 0 for the next round
                        for (int r = 0; r < tttBoard.length; r++) {
                            for (int c = 0; c < tttBoard[r].length; c++) {
                                tttBoard[r][c] = " ";
                            }
                        }
                    } else {
                        checkSpot = 0;
                    }
                    // If a bad input is experienced during the code, this will reset it back to normal
                    badInput1 = true;
                    badInput2 = true;
                    // increasing turn count every time a player play though a round fully
                    turnNum += 1;

                }
            } catch (InputMismatchException e) { // Checks if there is a mismatch input during the code
                System.out.println("Inappropriate input, please try again");
                scan.next();
            }

        }
    }
}
