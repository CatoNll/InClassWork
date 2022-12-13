import java.beans.IndexedPropertyChangeEvent;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Lesson_14_Try_Catch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //int num = 0;
/*
            System.out.println("Enter a number: ");
            int num;

            try{
                // the line that might crash
                num = scan.nextInt();
            } catch (InputMismatchException e) {
                // what to do if crash (Error message)
                System.out.println("Inappropriate input ");
            }

 */
/*            while (true) {
               System.out.println("Enter a number between 1 and 10: ");
               try {
                   num = scan.nextInt();
                   if ((num >= 1) && (num <= 10)) {
                       break;
                   } else {
                       System.out.println("number must be between 1 and 10.");
                   }
               } catch (InputMismatchException e) {
                   System.out.println("Inappropriate input, please try again");
                   scan.next(); // this clears the scanner input / needs to be here
               }
           }

  */
/*
        boolean keepLooping = true;
        ArrayList<Integer> testScores = new ArrayList<Integer>();

        System.out.println("Enter your test scores between 0 and 100 or enter -1 to quit: ");
        while (keepLooping) {


            try {
                int testScore = scan.nextInt();

                if ((testScore >= 0) && (testScore <= 100)) {
                    testScores.add(testScore);
                } else if (testScore == -1) {
                    System.out.println("Your test scores are: ");
                    for (int i = 0; i < testScores.size(); i++) {
                        System.out.println("Test " + (i + 1) + ": " + testScores.get(i));
                    }
                } else {
                    System.out.println("number must be between 1 and 100.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Inappropriate input, please try again");
                scan.next();
            }

        }
 */
            boolean loop1 = true;
            boolean loop2 = true;
            double pyththeo = 0;
            System.out.println("Enter A for the Pythagorean Theorem");
            double inputA = Double.parseDouble(scan.nextLine());
            System.out.println("Enter B for the Pythagorean Theorem");
            double inputB = Double.parseDouble(scan.nextLine());
            while (loop1) {
                try {
                    while (loop2){
                        if ((inputA >= 0) && (inputB >= 0)) {
                            pyththeo = Math.sqrt((Math.pow(inputA, 2)) + (Math.pow(inputB, 2)));
                            System.out.println(pyththeo);

                        }  else {
                            System.out.println("number can't be a negative number");

                        }
                        loop2 = false;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Inappropriate input, please try again");
                    scan.next();
                }
            }


    }
}

