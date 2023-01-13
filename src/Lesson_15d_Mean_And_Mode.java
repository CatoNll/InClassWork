import java.util.InputMismatchException;
import java.util.Locale;
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
        boolean keepLooping = true; // making the while loop true
        int rows = 0; // the amount of rows the 2D array needs to output
        int columns = 0; // the amount of columns the 2D array needs to output

        while (keepLooping) {
            Scanner scan = new Scanner(System.in); // anisalizeing the scanner
            try { // try catch for a mismatch exception
                int selectedColumn = 0; // the column that the user selects
                int mode = 0; // the mode of the entire table
                int modeIndex = 0; // helps output the mode
                double columnSum = 0; // the sum of the columns
                double tablesSum = 0; // the sum of the entire table
                int tableCounter[] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // array for the counting of the entire table
                int columnCounter[] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // array for the counting of the user selected column
                int mutiMode[] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // array for outputting multiple modes

                System.out.println("Enter the amount of rows."); // user enters that amount of rows that they want
                rows = scan.nextInt();
                System.out.println("Enter the amount of columns."); // user enters that amount of columns that they want
                columns = scan.nextInt();

                int board[][] = new int[rows][columns]; // sets the 2D array to the size of the requested values

                for (int r = 0; r < board.length; r++) { // outputs the table
                    for (int c = 0; c < board[r].length; c++) {
                        int rndNum = (int) (Math.round(Math.random() * 8.99));

                        board[r][c] = rndNum;
                        tableCounter[rndNum] += 1;

                        System.out.print(board[r][c] + " ");
                        tablesSum += board[r][c];
                    }
                    System.out.println();
                }

                System.out.println("Enter what column you want the average of between 0 and " + (columns - 1) + ":");
                selectedColumn = scan.nextInt(); // user enters the column that they want the average of
                for (int r = 0; r < board.length; r++) { // counts the sum of the collected numbers
                    int val = board[r][selectedColumn];
                    columnSum += val;
                    columnCounter[val] += 1;
                }
                System.out.println("The mean of column " + selectedColumn + " is: " + (columnSum / rows));
                // outputs the average of the selected column
                for (int i = 0; i < columnCounter.length; i++) { // outputs the number of times a number appears in the column
                    if (columnCounter[i] > 0) {
                        System.out.println(i + " occurs " + columnCounter[i] + " times in column " + selectedColumn);
                    }
                }

                System.out.println();
                System.out.println("Full Table: ");
                System.out.println("The mean of the whole table is: " + tablesSum / (rows * columns));
                // outputs the average of the entire table

                for (int i = 0; i < tableCounter.length; i++) { // outputs the number of times a number appears in the table
                    if (tableCounter[i] > 0) {
                        System.out.println(i + " occurs " + tableCounter[i] + " times in the table");
                    }

                    if (mode <= tableCounter[i]) { // finds the mode of the table
                        mode = tableCounter[i];
                        mutiMode[mode] += i;
                    }
                }
                System.out.println();
                System.out.print("The mode(s) of the table is: ");
                for (int i = 0; i < mutiMode.length; i++) {
                    if (mutiMode[i] > 0) {
                        System.out.print(mutiMode[i] + ", ");
                    }

                }

                scan = new Scanner(System.in);
                System.out.println("Enter q to exit.");
                String userExit = scan.nextLine().toLowerCase();

                if (userExit.equals("q")) { // exits out of the program
                    System.out.println("Thank you for using this program.");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Inappropriate input, please try again.");
                scan.next();
            }
        }
    }
}