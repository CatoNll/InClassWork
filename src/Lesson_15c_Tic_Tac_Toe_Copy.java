/*
      program: Tic Tac Toe
      Author: Noah Lowe, Roni Melamed
      Date crated: 2022/12/15
      Date last modified: 2022/12/22
*/

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson_15c_Tic_Tac_Toe_Copy {
    public static void main(String[] args) {

        // setting up scanner
        Scanner scan = new Scanner(System.in);

        // setting X as player 1, O as player 2 (for convenience)
        String player1 = "X";
        String player2 = "O";

        // initializing all variables
        int turnNum = 1; // to track turns
        double round = 1; // to track rounds
        double player1Score = 0; // player 1 score
        double player2Score = 0; // player 2 score
        int playerInput = 0;
        String player = " ";
        int checkSpot = 0; // Checks how many X or O are in the table
        String playerExit = "y"; // to give them the option to quit later on

        // creating boolean variables to control while loops
        boolean keepLooping = true;
        boolean validInput = true;


        // creating String array list to strong winner of each round
        ArrayList<String> winner= new ArrayList<>();

        // creating 3x3 board
        String tttBoard[][] = new String[3][3];

        // welcome / intro message
        System.out.println("Welcome to Tic Tac Toe. Press enter to continue");
        String enter = scan.nextLine();
        System.out.println("Player 1 is X's and Player 2 is O's");

        // initializing and printing board
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

        // main while loop
        while (keepLooping) {
            try {
                // secondary while loop
                while (keepLooping) {

                    // resetting scanner (for when the round repeats)
                    scan = new Scanner(System.in);

                    // if player chooses to exit game (enters negative value), game will end
                    if ((playerExit.equals("n"))) {
                        double player1WinPercent = (player1Score / (round - 1)) * 100;
                        double player2WinPercent = (player2Score / (round - 1)) * 100;

                        // outputting thank you message, win percentages, and the order of winners (so far)
                        System.out.println("Thank you for playing!");
                        System.out.println("Player 1 win percentage: " + String.format("%.2f", player1WinPercent) + "%. ");
                        System.out.println("Player 2 win percentage: " + String.format("%.2f", player2WinPercent) + "%. ");
                        System.out.print("There winning order is: ");
                        for (int i = 0; i < winner.size(); i++) {

                            System.out.print(winner.get(i) + " ");
                        }
                        // The reason that We are making keepLooping False and breaking at the same time is because if we dont change keepLooping to false
                        // the first while loop will continue to loop this output even though there is a brake
                        keepLooping = false;
                        break;

                    }

                    // outputting stats every time a move is made (round #, turn #, player scores)
                        System.out.println("Round: " + String.format("%.0f", round));
                        System.out.println("Turn: " + turnNum);
                        System.out.println("Player 1 score: " + (int) player1Score);
                        System.out.println("Player 2 score: " + (int) player2Score);
                        System.out.println();




                    // For player 1's inputs
                    if (turnNum % 2 != 0) { // if the number of turns is odd player 1 will go
                        System.out.println("Player 1, choose a box (1-9): ");
                        playerInput = scan.nextInt();
                        player = "X";

                    } else { // if the number of turns is even player 2 will go
                        System.out.println("Player 2, choose a box (1-9): ");
                        playerInput = scan.nextInt();
                        player = "O";
                    }
                    switch (playerInput) {

                        case 1:
                            if (tttBoard[0][0] == " ") {
                                tttBoard[0][0] = player;
                                break;
                            } else {
                                System.out.println("This space it taken. Renter your number.");
                                validInput = false;
                                break;
                            }

                        case 2:
                            if (tttBoard[0][1] == " ") {
                                tttBoard[0][1] = player;
                                break;
                            } else {
                                System.out.println("This space it taken. Renter your number.");
                                validInput = false;
                                break;
                            }
                        case 3:
                            if (tttBoard[0][2] == " ") {
                                tttBoard[0][2] = player;
                                break;
                            } else {
                                System.out.println("This space it taken. Renter your number.");
                                validInput = false;
                                break;
                            }
                        case 4:
                            if (tttBoard[1][0] == " ") {
                                tttBoard[1][0] = player;
                                break;
                            } else {
                                System.out.println("This space it taken. Renter your number.");
                                validInput = false;
                                break;
                            }
                        case 5:
                            if (tttBoard[1][1] == " ") {
                                tttBoard[1][1] = player;
                                break;
                            } else {
                                System.out.println("This space it taken. Renter your number.");
                                validInput = false;
                                break;
                            }
                        case 6:
                            if (tttBoard[1][2] == " ") {
                                tttBoard[1][2] = player;
                                break;
                            } else {
                                System.out.println("This space it taken. Renter your number.");
                                validInput = false;
                                break;
                            }
                        case 7:
                            if (tttBoard[2][0] == " ") {
                                tttBoard[2][0] = player;
                                break;
                            } else {
                                System.out.println("This space it taken. Renter your number.");
                                validInput = false;
                                break;
                            }
                        case 8:
                            if (tttBoard[2][1] == " ") {
                                tttBoard[2][1] = player;
                                break;
                            } else {
                                System.out.println("This space it taken. Renter your number.");
                                validInput = false;
                                break;
                            }
                        case 9:
                            if (tttBoard[2][2] == " ") {
                                tttBoard[2][2] = player;
                                break;
                            } else {
                                System.out.println("This space it taken. Renter your number.");
                                validInput = false;
                                break;
                            }
                    }
                    if (validInput) {
                        for (int r = 0; r < tttBoard.length; r++) {
                            for (int c = 0; c < tttBoard[r].length; c++) {
                                if (c == 0) {
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
                    }
                    scan = new Scanner(System.in);
                    // checks for every possible way of winning for player 1
                    if ((tttBoard[0][0] == "X" && tttBoard[0][1] == "X" && tttBoard[0][2] == "X") ||
                            (tttBoard[1][0] == "X" && tttBoard[1][1] == "X" && tttBoard[1][2] == "X") ||
                            (tttBoard[2][0] == "X" && tttBoard[2][1] == "X" && tttBoard[2][2] == "X") ||
                            (tttBoard[0][0] == "X" && tttBoard[1][0] == "X" && tttBoard[2][0] == "X") ||
                            (tttBoard[0][1] == "X" && tttBoard[1][1] == "X" && tttBoard[2][1] == "X") ||
                            (tttBoard[0][2] == "X" && tttBoard[1][2] == "X" && tttBoard[2][2] == "X") ||
                            (tttBoard[0][0] == "X" && tttBoard[1][1] == "X" && tttBoard[2][2] == "X") ||
                            (tttBoard[0][2] == "X" && tttBoard[1][1] == "X" && tttBoard[2][0] == "X")) {
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
                    else if ((tttBoard[0][0] == "O" && tttBoard[0][1] == "O" && tttBoard[0][2] == "O") ||
                            (tttBoard[1][0] == "O" && tttBoard[1][1] == "O" && tttBoard[1][2] == "O") ||
                            (tttBoard[2][0] == "O" && tttBoard[2][1] == "O" && tttBoard[2][2] == "O") ||
                            (tttBoard[0][0] == "O" && tttBoard[1][0] == "O" && tttBoard[2][0] == "O") ||
                            (tttBoard[0][1] == "O" && tttBoard[1][1] == "O" && tttBoard[2][1] == "O") ||
                            (tttBoard[0][2] == "O" && tttBoard[1][2] == "O" && tttBoard[2][2] == "O") ||
                            (tttBoard[0][0] == "O" && tttBoard[1][1] == "O" && tttBoard[2][2] == "O") ||
                            (tttBoard[0][2] == "O" && tttBoard[1][1] == "O" && tttBoard[2][0] == "O")) {
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
                    if (validInput) {
                        turnNum += 1;
                    }
                    // If a bad input is experienced during the code, this will reset it back to normal
                    validInput = true;
                    // increasing turn count every time a player play though a round fully


                }
            } catch (InputMismatchException e) { // Checks if there is a mismatch input during the code
                System.out.println("Inappropriate input, please try again");
                scan.next();
            }

        }
    }
}
