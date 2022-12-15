/*
      program: Table review
      Author: Noah Lowe
      Date crated: 2022/12/13
      Date last modified: 2022/12/13
       */

import java.util.Scanner;

public class Lesson_15b_Table {
    public static void main(String[] args) {
        // regular array

        int x[] = new int[20];
        for (int i = 0; i < x.length; i++) {
            x[i] = 7 * 1;
        }

        // Initialize a 2 x 3 table like this
        int table[][] = new int[][] {{1, 2, 3}, {4, 5, 6}};

        // tic tac toe table
        //String ttt[][] = new String[3][3]; // 3 x 3

        // hard code values into your t-t-t table
        String ttt [][] = new String[][] {{" "," ", " "}, {" "," ", " "}, {" "," ", " "}};

        // nested for loop to give it values
        // input table
        double randTable[][] = new double[5][8];
        for (int r = 0; r < randTable.length; r++) {
            for (int c = 0; c < randTable[r].length; c++){
                randTable[r][c] = Math.random();

            }
        }
        // Output table
        for (int r = 0; r < randTable.length; r++) {
            for (int c = 0; c < randTable[r].length; c++){
                System.out.print(String.format("%.2f", randTable[r][c])+ "|");

            }
            System.out.println();
        }




        // 4)
/*
        Scanner scan = new Scanner(System.in);

        System.out.println("How many rows do you want?");
        int rows = scan.nextInt();
        System.out.println("How many columns do you want?");
        int columns = scan.nextInt();

        int table[][] = new int[rows][columns];

        for (int r = 0; r < table.length; r++) {
            for (int c = 0; c < table[r].length; c++){
                table[r][c] = (int) Math.round(0 + Math.random()*99.99);
            }

        }
        for (int r = 0; r < table.length; r++) {
            int rowTotal = 0;

            for (int c = 0; c < table[r].length; c++){
                System.out.print(table[r][c] + " ");
                rowTotal += table[r][c];

            }
            rowTotal = rowTotal/rows;
            System.out.println("Avg: " + rowTotal);
        }

 */

        // 5)
/*
        int table[][] = new int[5][5];


        for (int r = 0; r < table.length; r++) {

            for (int c = 0; c < table[r].length; c++) {

            }

        }
        for (int r = 0; r < table.length; r++) {
            int num = 0;

            for (int c = 0; c < table[r].length; c++) {
                table[r][c] = table[num][num];
                System.out.print(table[r][c] + " ");
                num += 1;

            }

            System.out.println();

        }

 */
    }
}