import java.util.ArrayList;
import java.util.Scanner;

public class Lesson_12_Arraylist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Class lesson
/*
        ArrayList<String> stringsList= new ArrayList<>();
        stringsList.add("Hello");
        stringsList.add("world!");

        for (int i = 0; i < stringsList.size(); i++){
            System.out.print(stringsList.get(i) + " ");
        }

        System.out.println();

        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(i);
        }
        //System.out.println(intList.get(0));
        //intList.set(0, 5);
        //System.out.println(intList.get(0));
        // vals[0] = 5; - the array version of what we did

        // remove

        System.out.println(intList);
        intList.remove(5); // removes item at location 5
        System.out.println(intList);

         */

        // a) make an ArrayList that stores all integers <Interger> from 10 to 20. Use a for loop to output them all on one line.
/*
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 10; i < 21; i++) {
            intList.add(i);
        }
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " ");
        }
         */

        // b) Modify (a) - use a for loop to replace all even numbers with the number 0. Output the new list

        // c) Modify (b) - use another loop to remove all ODD values output the new list

        // d) Make an ArrayList program that that stores favorite foods of the user as Strings. They can keep entering
        // favorite foods until they enter ("q") it should output their list of foods every time with a for loop.

        ArrayList<String> stringsList= new ArrayList<>();
        System.out.println("Enter your favorite foods. Enter q to exit");
        while (true) {
            String favFoods = scan.nextLine();

            stringsList.add(favFoods);
        }

        // e) Redo the test average program with an ArrayList to story each score. The user inputs test scores intel they
        // enter ("q" or -1) and then it outputs the average



    }
}
