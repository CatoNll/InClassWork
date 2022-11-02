/*
      program: For Loops
      Author: Noah Lowe
      Date crated: 11/01/22
      Date last modified 11/01/22
*/

import java.util.Scanner;

public class Lesson_9_For_Loops {
    public static void main(String[] args) {
        // Class work
        /*
        int i = 1;
        while (1 <= 6) {
            System.out.println(i);
            i ++;
        }

         */
        /*
        for (int i = 0; i <= 5; i += 1) {
            System.out.println(i);
        }
        for (int i = 100; i > 0; i -= 1) {
            System.out.println(i);
        }

         */
        /*

        System.out.println("Enter the max number to square: ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i += 1) {
            System.out.println(i + " squared is " + i*i);
        }
         */

        Scanner scan = new Scanner(System.in);

        // Homework

        // a)
/*
        System.out.println("Enter the min number: ");
        int min = scan.nextInt();
        System.out.println("Enter the max number: ");
        int max = scan.nextInt();
        System.out.println("The integers between " + min + " and " + max + " are:");
        for (int output = min; output <= max; output += 1) {
            System.out.println(output);
        }

 */
        // b)
/*
        System.out.println("Enter the min number: ");
        int min = scan.nextInt();
        System.out.println("Enter the max number: ");
        int max = scan.nextInt();
        System.out.println("The integers between " + min + " and " + max + " are:");
        for (int output = min; output <= max; output += 2) {
            System.out.println(output);

        }

 */
        // c)
/*
        for (int output = 100; output > 0; output -= 5) {
            System.out.println(output);
        }

 */
        // d)
/*
        System.out.println("Enter a integer: ");
        int num = scan.nextInt();
        int total = 0;
        System.out.println("The factors of " + num + " are:");
        for (int output = 2; output < num; output ++) {
            if (num % output == 0) {
                System.out.println(num + " is divisble by " + output);
                total ++;
            }
        }
        System.out.println("The total number of factors of " + num + " is " + total);

 */
        // e)
/*
        System.out.println("Enter the first integer: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second integer: ");
        int num2 = scan.nextInt();

        int total = 0;
        System.out.println("The factors of " + num1 + " are:");
        for (int output = num2; output < num1; output ++) {
            if (num1 % output == 0) {
                System.out.println(num1 + " is divisble by " + output);
                total ++;
            }
        }
        System.out.println("The total number of factors of " + num1 + " is " + total);
 */
        // f)
/*
        System.out.println("Enter how many terms you want to print: ");
        int count = scan.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3;


        System.out.print(num1 + " " + num2);

        for (int output = 2; output < count; ++output) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }

 */
    }
}
