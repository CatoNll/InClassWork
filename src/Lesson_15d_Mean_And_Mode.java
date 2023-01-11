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

        while (keepLooping) {
            int selectedColumn = 0;
            int mode = 0;
            int modeIndex = 0;
            double columnSum = 0;
            double tablesSum = 0;
            int tableCounter[] = new int[] {0,0,0,0,0,0,0,0,0,0};
            int columnCounter[] = new int[] {0,0,0,0,0,0,0,0,0,0};

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the amount of rows.");
            rows = scan.nextInt();
            System.out.println("Enter the amount of columns.");
            columns = scan.nextInt();

            int board[][] = new int[rows][columns];

            for (int r = 0; r < board.length; r++) {
                for (int c = 0; c < board[r].length; c++) {
                    int rndNum = (int) (Math.random() * 9);

                    board[r][c] = rndNum;
                    tableCounter[rndNum] += 1;

                    System.out.print(board[r][c] + " ");
                    tablesSum += board[r][c];
                }
                System.out.println();
            }
            System.out.println("Enter what column you want the average of:");
            selectedColumn = scan.nextInt();
            for (int r = 0; r < board.length; r++) {
                    int val = board[r][selectedColumn];
                    columnSum += val;
                    columnCounter[val] += 1;
            }
            System.out.println("The mean of column " + selectedColumn + " is: " + (columnSum/rows));
            for (int i = 0; i < columnCounter.length; i++){
                if (columnCounter[i] > 0) {
                    System.out.println(i + " occurs " + columnCounter[i] + " times in column " + selectedColumn);
                }
            }

            System.out.println();
            System.out.println("Full Table: ");
            System.out.println("The mean of the whole table is: " + tablesSum/(rows * columns));

            for (int i = 0; i < tableCounter.length; i++){
                if (tableCounter[i] > 0) {
                    System.out.println(i + " occurs " + tableCounter[i] + " times in the table");
                }

                if (mode <= tableCounter[i]){
                    mode = tableCounter[i];
                    modeIndex = i;
                }
            }
            System.out.println();
            System.out.println("The mode is: " + modeIndex);
        }
    }
}