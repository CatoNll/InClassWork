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
        /*
        int array[] = new int[11];

        for (int i = 1; i<array.length; i++) {
            array[i] = (int) Math.pow(i, 2);
        }
        System.out.println("Your array is: ");
        for (int i = 1; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
         */

        // Array that is needs to be bigger then the users needs
        /*
        // Program to enter how much money you spend daily
        // Make the array big enough to hold more then enough values
        double cost[] = new double[1000]; // Big enough
        int counter = 0;

        while (true){
            System.out.println("Enter how much money you made one day " + (counter + 1) + ": (Enter a negative value to quit");
            double val = scan.nextDouble();
            if (val < 0) {
                break;
            } else {
                cost[counter] = val;
                counter++;
            }
        }
        // output them
        for (int i = 0; i < counter; i++) {
            System.out.println("Day " + (i+1) + ": " + cost[i]);
        }

        // for loop to add them up
        double total = 0;
        for (int i = 0; i < counter; i++) {
            total += cost[i];
        }
        System.out.println("The total of all amounts: $" + total);
         */

        // Program 1
        /*
        // allows the user to enter test persantages (-1 to quit) into an int array
        // with a while loop
        // for loop to output all test scores nicely
        // for loop to add up all the scores and use the value to output the average test scores
        double scores[] = new double[10]; // Big enough
        int counter = 0;
        while (true) {
            System.out.println("Enter the score on test " + (counter + 1) + ": (Enter a negative number to quit");
            double val = scan.nextDouble();

            if (val < 0) {
                break;
            } else {
                scores[counter] = val;
                counter++;
            }
        }
        for (int i = 0; i < counter; i++) {
            System.out.println("Your score in test " + (i+1) + " is: " + scores[i] + "%");
        }
        double total = 0;
        for (int i = 0; i < counter; i++) {
            total = (total + scores[i]);
        }
        System.out.println("The avrage of all of your test scores is: " + (total/counter) + "%");

         */

        // Program 2
        /*
        int nums[] = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 4;
        }
        System.out.println("Your array for the multiples of 4 is: ");
        for (int i = 0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

         */

        // Program 3
        /*
        System.out.println("Enter who may multiples of 4 you want: ");
        int userchouse = scan.nextInt();

        int nums[] = new int[userchouse];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 4;
        }
        System.out.println("Your array for the multiples of 4 is: ");
        for (int i = 0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
         */

        // Program 4
        /*

        int phoneNum[] = new int[10];
        String names[] = new String[10];
        int counter = 0;
        for (int i = 0; i<phoneNum.length; i++) {
            phoneNum[i] = (int) (1000000+Math.random()*9999999);
        }
        for (int i = 0; i<names.length; i++) {
            counter++;
            System.out.println("Enter name number " + counter + ":");
            names[i] = scan.nextLine();
        }
        for (int i = 0; i<phoneNum.length; i++) {
            System.out.println("The phone number for " + names[i] + " is: " + phoneNum[i]);
        }
         */

        // Program 5

        int diceRoll[] = new int[100];
        int rollCounts[] = new int[13];
        for (int i = 0; i < rollCounts.length; i++) {
            rollCounts[i] = 0;
        }
        for (int i = 0; i < diceRoll.length; i++) {
            int roll1 = (int) (1 + Math.random()* 5.99);
            int roll2 = (int) (1 + Math.random()* 5.99);
            int rollTotal = roll1 + roll2;
            diceRoll[i] = rollTotal;
            // System.out.println("Roll " + (i + 1) + " is: " + rollTotal);

            rollCounts[rollTotal] += 1;
            // if you roll at 7, rollCounts[7] += 1

        }
        for (int i = 2; i < rollCounts.length; i++) {
            System.out.println("You rolled a " + i + "; " + rollCounts[i] + " times.");
        }

        System.out.print("counts: ");
        for (int i = 2; i < rollCounts.length; i++){
            System.out.print(rollCounts[i] + " ");
            if (i != rollCounts.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
