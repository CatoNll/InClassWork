import java.util.Scanner;
/*
      program: InClass Assignment 2
      Author: Noah Lowe
      Date crated: 10/31/22
      Date last modified 10/31/22
*/
public class Lesson_8b_While_Loop_Assinment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1)
        Boolean keepLooping = true;
        int numCounter = 1; // outputs the amount of times the name has been outputted
        System.out.println("Enter your name: ");
        String userName = scan.nextLine(); // Takes uses name input
        System.out.println("How many times do you want to output your name");
        String userNum = scan.nextLine(); // Takes the amount of times it should be outputted

        int userNumInt = Integer.parseInt(userNum); // converts the string to an Int
        // Increases the number of asked outputs by 1 since the if statement will cut off the amount by one

        while (keepLooping) {
            System.out.println(numCounter + ") " + userName);
            numCounter = numCounter + 1;
            if (numCounter > userNumInt) {
                keepLooping = false;
            }

        }

        // 2)

        keepLooping = true;
        System.out.println("Enter starting number: ");
        String startNum = scan.nextLine(); // takes the user starting num
        System.out.println("Enter the Ending number: ");
        String endNum = scan.nextLine(); // takes the user ending num
        System.out.println("Enter the divisor");
        String divisor = scan.nextLine(); // takes the user divisor


        int startNumInt = Integer.parseInt(startNum); // converts the string to an Int
        int endNumInt = Integer.parseInt(endNum); // converts the string to an Int
        int divisorInt = Integer.parseInt(divisor); // converts the string to an Int

        while (keepLooping) { // loops the equation
            startNumInt = startNumInt + 1;

            if (startNumInt % divisorInt == 0) {
                System.out.println(startNumInt);
            } else if (startNumInt >= endNumInt) { // once the max num is met it will stop the loop
                keepLooping = false;
            }


        }

        // 3)

        keepLooping = true;



        while (keepLooping) {
            System.out.println("Enter the radius of a circle, enter a negative number to exit: ");
            String radius = scan.nextLine(); // takes the user radius
            System.out.println("Enter a to calculate the area of a circle, or enter c for the circumference: ");
            String areaOrCircumference = scan.nextLine().toLowerCase(); // takes the user ether wants to calculate the area
                                                                        // or circumference

            int radiusInt = Integer.parseInt(radius);

            if (radiusInt < 0) { // if radius is a negative num, the loop will end
                keepLooping = false;
                System.out.println("Thanks of using the program");
            }else if (areaOrCircumference.equals("a")) { // calculates the area
                double area = Math.PI * Math.pow(radiusInt, 2);
                System.out.println("The area of the circle is: " + area);


            } else if (areaOrCircumference.equals("c")) { // calculates the circumference
                double circumference = 2 * Math.PI * radiusInt;
                System.out.println("The circumference of the circle is: " + circumference);

            }
        }
    }
}
