import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson_15_Multidimensional_Arrays {
    public static void main(String[] args) {
        // 1D Array
/*
        int nu[] = new int[] {1, 2, 3};
 */

        // 2D Array
/*
        int table [][] = new int [3][4]; // 3 rows, 4 columns
        System.out.println(table[0].length); // columns
        System.out.println(table.length); // rows
 */
/*
        String info[][] = new String[][] {{"Matt", "Drorit"}, {"Best", "second best"}};

        // or

        String tictactoe [][] = new String[][] {{"O", "O", "O"}, {"X", "X", "X"}, {"O", "O", "O"}};

        // or

        int numTable[][] = new int[][] {{1, 2} , {3, 4}};
 */
/*
        int table[][] = new int[3][4];
        for (int i = 0; i<table.length; i++) {
            for (int j = 0; j<table[0].length; j++) {
                table[i][j] = (int) (1+Math.random()*9);

            }
        }
        String currentLine;
        for (int r = 0; r< table.length; r++) {
            currentLine = ""; // blank string for a new row
            for (int c = 0; c<table[0].length; c++) {
                currentLine += String.valueOf(table[r][c]) + " "; // add current cell
            }
            System.out.println(currentLine);
        }
 */

        // 1)
/*
        String table[][] = new String[][] {{"Brandon", "Alec", "Noah"}, {"Rudick", "Freilich", "Lowe"}, {"Red", "Green", "Blue"}};
        String currentLine;
        for (int r = 0; r< table.length; r++) {
                currentLine = ""; // blank string for a new row
                for (int c = 0; c<table[0].length; c++) {
                    currentLine += String.valueOf(table[r][c]) + " "; // add current cell
                }
                System.out.println(currentLine);
            }

 */
        // 2)
/*
        String table[][] = new String[][] {{"|", "Brandon", "|", "Alec", "|", "Noah", "|"},
                {"|", "Rudick", "|", "Freilich", "|", "Lowe", "|",}, {"|", "Red", "|", "Green", "|", "Blue", "|"}};
        String currentLine;
        for (int r = 0; r< table.length; r++) {
            currentLine = ""; // blank string for a new row
            for (int c = 0; c<table[0].length; c++) {
                currentLine += String.valueOf(table[r][c]) + " "; // add current cell
            }
            System.out.println(currentLine);


 */
        // 3)

        Scanner scan = new Scanner(System.in);
/*
        String table[][] = new String[][] {{"Brandon", "Alec", "Noah"},
                {"Rudick", "Freilich", "Lowe"}, {"Red", "Green", "Blue"}};
        String currentLine;
        for (int r = 0; r< table.length; r++) {
            currentLine = "| "; // blank string for a new row
            for (int c = 0; c<table[0].length; c++) {
                currentLine += String.valueOf(table[r][c]) + " | "; // add current cell
            }
            System.out.println(currentLine);
        }
        while (true) {
            try {
                System.out.println("Which column? ");
                int userInput = scan.nextInt();
                if ((userInput >= 0) && (userInput < table.length)) {
                    System.out.println("Name: " + table[1][userInput] + ", " + table[0][userInput] + ". Colour: " + table[2][userInput]);
                } else {
                    System.out.println("The valid range is between 0 - " + (table.length - 1));
                }
            } catch (InputMismatchException e) {
                System.out.println("The valid range is between 0 - " + (table.length - 1));
                scan.next();
            }

        }
 */
/*
        for(int i = 1; i<=10; i++) {
            for (int j = 1; j<=10; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }

 */
    }
}
