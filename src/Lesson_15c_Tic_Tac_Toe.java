/*
      program: Tic Tac Toe
      Author: Noah Lowe, Roni Melamed
      Date crated: 2022/12/15
      Date last modified: 2022/12/22
*/

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
        boolean keepLooping = true;
        boolean badInput1 = true;
        boolean badInput2 = true;
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
                System.out.print("|" + tttBoard[r][c]);
            }
            System.out.println("|");
            System.out.println("_______");

        }

        while (keepLooping) {
            turnNum += 1;
            System.out.println("Round: " + round);
            System.out.println("Turn: " + turnNum);
            System.out.println("Player 1 score: " + player1Score);
            System.out.println("Player 2 score: " + player2Score);
            System.out.println("Enter -1 to quit. ");
            System.out.println();


                if (turnNum % 2 != 0) {
                    while (badInput1) {
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
                } else {
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
                    System.out.print("|" + tttBoard[r][c]);
                }
                System.out.println("|");
                System.out.println("_______");

                }
            if ((player1Input == -1) || (player2Input == -1)) {
                double player1WinPercent = player1Score/round;
                double player2WinPercent = player2Score/round;
                System.out.println("Thank you for playing!");
                System.out.println("Player 1 win percentage: " + player1WinPercent + "%. ");
                System.out.println("Player 2 win percentage: " + player2WinPercent + "%. ");
                break;
            }

            if ((tttBoard[0][0] == player1 && tttBoard[0][1] == player1 && tttBoard[0][2] == player1) ||
                    (tttBoard[1][0] == player1 && tttBoard[1][1] == player1 && tttBoard[1][2] == player1) ||
                    (tttBoard[2][0] == player1 && tttBoard[2][1] == player1 && tttBoard[2][2] == player1) ||
                    (tttBoard[0][0] == player1 && tttBoard[1][0] == player1 && tttBoard[2][0] == player1) ||
                    (tttBoard[0][1] == player1 && tttBoard[1][1] == player1 && tttBoard[2][1] == player1) ||
                    (tttBoard[0][2] == player1 && tttBoard[1][2] == player1 && tttBoard[2][2] == player1) ||
                    (tttBoard[0][0] == player1 && tttBoard[1][1] == player1 && tttBoard[2][2] == player1) ||
                    (tttBoard[0][2] == player1 && tttBoard[1][1] == player1 && tttBoard[2][0] == player1)) {
                System.out.println("Player 1 won this round!");
                round += 1;
                player1Score += 1;
                turnNum = 0;
                for (int r = 0; r < tttBoard.length; r++) {
                    for (int c = 0; c < tttBoard[r].length; c++) {
                        tttBoard[r][c] = " ";
                    }
                }
            } else if ((tttBoard[0][0] == player2 && tttBoard[0][1] == player2 && tttBoard[0][2] == player2) ||
                    (tttBoard[1][0] == player2 && tttBoard[1][1] == player2 && tttBoard[1][2] == player2) ||
                    (tttBoard[2][0] == player2 && tttBoard[2][1] == player2 && tttBoard[2][2] == player2) ||
                    (tttBoard[0][0] == player2 && tttBoard[1][0] == player2 && tttBoard[2][0] == player2) ||
                    (tttBoard[0][1] == player2 && tttBoard[1][1] == player2 && tttBoard[2][1] == player2) ||
                    (tttBoard[0][2] == player2 && tttBoard[1][2] == player2 && tttBoard[2][2] == player2) ||
                    (tttBoard[0][0] == player2 && tttBoard[1][1] == player2 && tttBoard[2][2] == player2) ||
                    (tttBoard[0][2] == player2 && tttBoard[1][1] == player2 && tttBoard[2][0] == player2)) {
                System.out.println("Player 2 won this round!");
                round += 1;
                player2Score += 1;
                turnNum = 0;
                for (int r = 0; r < tttBoard.length; r++) {
                    for (int c = 0; c < tttBoard[r].length; c++) {
                        tttBoard[r][c] = " ";
                    }
                }
            }
            badInput1 = true;
            badInput2 = true;


        }
    }
}
