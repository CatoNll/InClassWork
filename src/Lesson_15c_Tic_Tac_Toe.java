import java.util.Scanner;

public class Lesson_15c_Tic_Tac_Toe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String currentLine;
        String player1 = "X";
        String player2 = "O";
        Boolean keepLooping = true;
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


            System.out.println("Player 1, choose a box (1-9): ");
            int player1Input = scan.nextInt();

            switch (player1Input) {
                case 1:
                    tttBoard[0][0] = player1;
                    break;
                case 2:
                    tttBoard[0][1] = player1;
                    break;
                case 3:
                    tttBoard[0][2] = player1;
                    break;
                case 4:
                    tttBoard[1][0] = player1;
                    break;
                case 5:
                    tttBoard[1][1] = player1;
                    break;
                case 6:
                    tttBoard[1][2] = player1;
                    break;
                case 7:
                    tttBoard[2][0] = player1;
                    break;
                case 8:
                    tttBoard[2][1] = player1;
                    break;
                case 9:
                    tttBoard[2][2] = player1;
                    break;
            }
            System.out.println("Player 2, choose a box (1-9): ");
            int player2Input = scan.nextInt();

            switch (player2Input) {
                case 1:
                    tttBoard[0][0] = player2;
                    break;
                case 2:
                    tttBoard[0][1] = player2;
                    break;
                case 3:
                    tttBoard[0][2] = player2;
                    break;
                case 4:
                    tttBoard[1][0] = player2;
                    break;
                case 5:
                    tttBoard[1][1] = player2;
                    break;
                case 6:
                    tttBoard[1][2] = player2;
                    break;
                case 7:
                    tttBoard[2][0] = player2;
                    break;
                case 8:
                    tttBoard[2][1] = player2;
                    break;
                case 9:
                    tttBoard[2][2] = player2;
                    break;
            }

            for (int r = 0; r < tttBoard.length; r++) {
                for (int c = 0; c < tttBoard[r].length; c++) {
                    System.out.print("|" + tttBoard[r][c]);
                }
                System.out.println("|");
                System.out.println("_______");

                }



        }
    }
}
