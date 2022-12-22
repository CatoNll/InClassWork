import java.util.ArrayList;
import java.util.Scanner;

public class Lesson_15c_Tic_Tac_Toe_Effishesy_Test {
    public static void main(String[] args) {
        // For player 1's inputs
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
        int player1Input = 0; // player 1's inputs
        int player2Input = 0; // player 2's inputs
        int playerInput = 0;
        String player = " ";
        int checkSpot = 0; // Checks how many X or O are in the table
        String playerExit = "y"; // to give them the option to quit later on

        // creating boolean variables to control while loops
        boolean keepLooping = true;
        boolean badInput1 = true;
        boolean badInput2 = true;
        boolean gameWin = false;
        boolean validInput = true;


        // creating String array list to strong winner of each round
        ArrayList<String> winner = new ArrayList<>();

        // creating 3x3 board
        String tttBoard[][] = new String[3][3];

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

                if (turnNum % 2 != 0) { // if the number of turns is odd player 1 will go
                    System.out.println("Player 1, choose a box (1-9): ");
                    playerInput = scan.nextInt();
                    player = "X";
/*
                while (badInput1) { // If a spot on the board is taken, the player will have to reenter a new number
                    System.out.println("Player 1, choose a box (1-9): ");
                    playerInput = scan.nextInt();

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

 */
                } else { // if the number of turns is even player 2 will go
                    System.out.println("Player 2, choose a box (1-9): ");
                    playerInput = scan.nextInt();
                    player = "O";
/*
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

                 */
                }
                switch (playerInput) {

                    case 1:
                        if (tttBoard[0][0] == " ") {
                            tttBoard[0][0] = player;
                            badInput2 = false;
                            break;
                        } else {
                            System.out.println("This space it taken. Renter your number.");
                            validInput = false;
                            break;
                        }

                    case 2:
                        if (tttBoard[0][1] == " ") {
                            tttBoard[0][1] = player;
                            badInput2 = false;
                            break;
                        } else {
                            System.out.println("This space it taken. Renter your number.");
                            validInput = false;
                            break;
                        }
                    case 3:
                        if (tttBoard[0][2] == " ") {
                            tttBoard[0][2] = player;
                            badInput2 = false;
                            break;
                        } else {
                            System.out.println("This space it taken. Renter your number.");
                            validInput = false;
                            break;
                        }
                    case 4:
                        if (tttBoard[1][0] == " ") {
                            tttBoard[1][0] = player;
                            badInput2 = false;
                            break;
                        } else {
                            System.out.println("This space it taken. Renter your number.");
                            validInput = false;
                            break;
                        }
                    case 5:
                        if (tttBoard[1][1] == " ") {
                            tttBoard[1][1] = player;
                            badInput2 = false;
                            break;
                        } else {
                            System.out.println("This space it taken. Renter your number.");
                            validInput = false;
                            break;
                        }
                    case 6:
                        if (tttBoard[1][2] == " ") {
                            tttBoard[1][2] = player;
                            badInput2 = false;
                            break;
                        } else {
                            System.out.println("This space it taken. Renter your number.");
                            validInput = false;
                            break;
                        }
                    case 7:
                        if (tttBoard[2][0] == " ") {
                            tttBoard[2][0] = player;
                            badInput2 = false;
                            break;
                        } else {
                            System.out.println("This space it taken. Renter your number.");
                            validInput = false;
                            break;
                        }
                    case 8:
                        if (tttBoard[2][1] == " ") {
                            tttBoard[2][1] = player;
                            badInput2 = false;
                            break;
                        } else {
                            System.out.println("This space it taken. Renter your number.");
                            validInput = false;
                            break;
                        }
                    case 9:
                        if (tttBoard[2][2] == " ") {
                            tttBoard[2][2] = player;
                            badInput2 = false;
                            break;
                        } else {
                            System.out.println("This space it taken. Renter your number.");
                            validInput = false;
                            break;
                        }
                }


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
                if (validInput) {
                    turnNum += 1;
                }
                validInput = true;

        }
    }
}
