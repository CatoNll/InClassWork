import java.util.Scanner;

public class Lesson_11_Arrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //  Method 1: Give them values right away
/*
        int x[] = new int[] {1, 2, 3, 4, 5}; // 5 integers, values in { }
        String words [] = new String[] {"hello", "goodbye", "shalom"}; // 3 strings
        double dubs[] = new double[] {1.5, 3.6}; // 2 doubles
*/

        // Method 2: start them empty and give them values later (more common)
/*
        int x[] = new int[10];
        String words[] = new String[10];
        double dubs[] = new double[10];
 */
/*
        // Declare empty array of 5 ints
        int x[] = new int[5];

        // Give it a value directly
        x[0] = 15;

        // Input a value to it
        System.out.println("Enter the second number: ");
        x[1] = scan.nextInt();

        // Use a for loop to populate the array with random 1 - 10
        for (int i = 0; i<x.length; i++) {
            x[i] = (int) (1+Math.random()*9);
        }

        // Print the array

        System.out.println("Your array is: ");
        for (int i = 0; i<x.length; i++) {
            // .print (as opposed to .println) does not go to the next line
            System.out.print(x[i] + " ");
 */
        // a)
        /*
        int array[] = new int[5];
        for (int i = 0; i<array.length; i++) {
            System.out.println("Enter number " + i + " in the array: ");
            array[i] = scan.nextInt();
        }
        System.out.println("Your array is: ");
        for (int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
         */

        // b)
        /*
        String array[] = new String[6];
        for (int i = 1; i < array.length; i++) {
            System.out.println("Enter your " + i + "st favorite food: ");
            array[i] = scan.nextLine();
        }
        System.out.println("Your array is: ");
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
         */

        // c)
        /*
        double array[] = new double[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (3+Math.random()*7);
        }
        System.out.println("Your array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
         */

        // d)

        int array[] = new int[11];

        for (int i = 1; i<array.length; i++) {
            array[i] = (int) Math.pow(i, 2);
        }
        System.out.println("Your array is: ");
        for (int i = 1; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
