import java.util.Scanner;

/*
      program: Method
      Author: Noah Lowe
      Date crated: 2023/01/09
      Date last modified: 2023/01/09
*/
public class Lesson_16_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*
        int x = 5;
        System.out.println("You can print a sentence");
        System.out.println("You can output values too: " + x);

        int a[] = new int[] {1, 2, 3};
        System.out.println(a.toString());
 */
/*
        //cheer(); // Calling the method

        Scanner scan = new Scanner(System.in);
        System.out.println("What's your team? ");
        String team = scan.nextLine();
        cheer2(team);
    }
    // declaring the method cheer2
    private static void cheer2(String team){
        // team is an "argument" - value you sent to a method
        System.out.println("Go, " + team + ", Go!");
    }
 */
/*
    private static void cheer() {
        // Private static void - just type these for now
        // Void --> not returning any value
        System.out.println("go, Leafs, go!");
    }

    private static void gotInformation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you");
    }


 */
        // 1
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 of your favorite foods");
        String favFood1 = scan.nextLine();
        String favFood2 = scan.nextLine();
        String favFood3 = scan.nextLine();
        favFoods(favFood1, favFood2, favFood3);


    }

    private static void favFoods(String favFood1, String favFood2, String favFood3) {
        System.out.println("Your favorite foods are " + favFood1 + ", " + favFood2 + ", " + favFood3);

    }

 */
        // 2
        System.out.println("Enter A and B for a right triangle");
        System.out.println("Enter A and B. ");
        double valA = scan.nextDouble();
        double valB = scan.nextDouble();
        getHypotenuse (valA, valB);
    }
    public static void getHypotenuse(double valA, double valB) {
        double hypotenuse = Math.sqrt(Math.pow(valA, 2) + Math.pow(valB, 2));
        System.out.println("The Hypotenuse of the triangle with the A side being " + valA +", and the B side being "
                + valB + ", is " + hypotenuse);
    }
}






