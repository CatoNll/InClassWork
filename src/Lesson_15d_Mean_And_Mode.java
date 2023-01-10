import java.util.Scanner;

/*
      program: 2D arrays Mean and Mode
      Author: Noah Lowe
      Date crated: 2023/01/10
      Date last modified: 2023/01/10
*/
// aim for under 100 lines
public class Lesson_15d_Mean_And_Mode {
    public static void main(String[] args) {
        boolean keepLooping = true;
        int rows = 0;
        int columns = 0;
        int aveColumn = 0;
        double columnAverage = 0;
        double tableAverage = 0;
        int columnConter0 = 0;
        int columnConter1 = 0;
        int columnConter2 = 0;
        int columnConter3 = 0;
        int columnConter4 = 0;
        int columnConter5 = 0;
        int columnConter6 = 0;
        int columnConter7 = 0;
        int columnConter8 = 0;
        int columnConter9 = 0;

        while (keepLooping) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the amount of rows.");
            rows = scan.nextInt();
            System.out.println("Enter the amount of columns.");
            columns = scan.nextInt();

            int board[][] = new int[rows][columns];

            for (int r = 0; r < board.length; r++) {
                for (int c = 0; c < board[r].length; c++) {
                    board[r][c] = (int) (Math.random() * 9);
                }
            }
            for (int r = 0; r < board.length; r++) {
                for (int c = 0; c < board[r].length; c++) {
                    System.out.print(board[r][c] + " ");
                    tableAverage += board[r][c];
                }
                System.out.println();
            }
            System.out.println("Enter what column you want the average of:");
            aveColumn = scan.nextInt();
            for (int r = 0; r < board.length; r++) {
                for (int c = aveColumn; c < (aveColumn + 1); c++) {
                    columnAverage += board[r][c];
                    if (board[r][c] == 0){
                      columnConter0 += 0;
                    } else if (board[r][c] == 1) {
                       columnConter1 += 1;
                    } else if (board[r][c] == 2) {
                        columnConter2 += 1;
                    } else if (board[r][c] == 3) {
                        columnConter3 += 1;
                    } else if (board[r][c] == 4) {
                        columnConter4 += 1;
                    }else if (board[r][c] == 5) {
                        columnConter5 += 1;
                    }else if (board[r][c] == 6) {
                        columnConter6 += 1;
                    }else if (board[r][c] == 7) {
                        columnConter7 += 1;
                    }else if (board[r][c] == 8) {
                        columnConter8 += 1;
                    }else if (board[r][c] == 9) {
                        columnConter9 += 1;
                    }
                }
            }
            System.out.println("The mean of column " + aveColumn + " is: " + (columnAverage/rows));
            if (columnConter0 > 0) {
                System.out.println("0 occurs " + columnConter0 + " times in column " + aveColumn);
            }
            if (columnConter1 > 0) {
                System.out.println("1 occurs " + columnConter1 + " times in column " + aveColumn);
            }
            if (columnConter2 > 0) {
                System.out.println("2 occurs " + columnConter2 + " times in column " + aveColumn);
            }
            if (columnConter3 > 0) {
                System.out.println("3 occurs " + columnConter3 + " times in column " + aveColumn);
            }
            if (columnConter4 > 0) {
                System.out.println("4 occurs " + columnConter4 + " times in column " + aveColumn);
            }
            if (columnConter5 > 0) {
                System.out.println("5 occurs " + columnConter5 + " times in column " + aveColumn);
            }
            if (columnConter6 > 0) {
                System.out.println("6 occurs " + columnConter6 + " times in column " + aveColumn);
            }
            if (columnConter7 > 0) {
                System.out.println("7 occurs " + columnConter7 + " times in column " + aveColumn);
            }
            if (columnConter8 > 0) {
                System.out.println("8 occurs " + columnConter8 + " times in column " + aveColumn);
            }
            if (columnConter9 > 0) {
                System.out.println("9 occurs " + columnConter9 + " times in column " + aveColumn);
            }
            System.out.println();
            System.out.println("Full Table: ");
            System.out.println("The mean of the whole table is: " + tableAverage);
        }
    }
}