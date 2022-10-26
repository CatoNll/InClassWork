import java.util.Scanner;

public class Lesson_8_While_Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


      /*
      int i = 0; // printing multiples of 5 from 0 to 100
      while (i < 100) {
          System.out.println(i);
          i += 5;


      //Exercises 1

      // a)



      System.out.println("Inter a min and max nun with a space between them. ");
      String minAndMax = scan.nextLine();     // gathers the users input
      int findspace = minAndMax.indexOf(" "); // finds the space between the 2 numbers
      String min = minAndMax.substring(0, findspace); // splits the first number from the second and puts it into its
                                                      // own variable
      String max = minAndMax.substring(findspace, minAndMax.length() -0).trim(); // splits the second number from the
                                                                                 // string and puts it into its own variable
      int minI = Integer.parseInt(min); // turns the first number into a int from a string
      int maxI = Integer.parseInt(max); // turns the second number into a int from a string

      while (minI < maxI) { // the loop will only stop when min is not less then the max
          System.out.println(minI);
          minI += 1; // adds one to the min to get all of the integers between the two numbers



      // b)

      System.out.println("Inter a min and max nun with a space between them. ");
      String minAndMax = scan.nextLine();     // gathers the users input
      int findspace = minAndMax.indexOf(" "); // finds the space between the 2 numbers
      String min = minAndMax.substring(0, findspace); // splits the first number from the second and puts it into its
      // own variable
      String max = minAndMax.substring(findspace, minAndMax.length() -0).trim(); // splits the second number from the
      // string and puts it into its own variable
      int minI = Integer.parseInt(min); // turns the first number into a int from a string
      int maxI = Integer.parseInt(max); // turns the second number into a int from a string

      while (minI < maxI) { // the loop will only stop when min is not less then the max
          System.out.println(minI);
          minI += 2; // adds one to the min to get all of the integers between the two numbers



      int mult5 = 100;

      while (mult5 > 4){
          System.out.println(mult5);
          mult5 -= 5;



       boolean keepLooping = true;
       while (keepLooping) {
           System.out.println("Do you want to loop looping? y/n ");
           String choice = scan.next();
           if (choice.equals("y")){
               System.out.println("Looping again");
           } else if (choice.equals("n")){
               System.out.println("Quitting");
               keepLooping = false;
           } else {
               System.out.println("invalid choice");





       // Exercises

           // A)

           System.out.println("Enter a double. ");
           String num = scan.nextLine();
           double dub = Double.parseDouble(num);
           boolean keepLooping = true;

           while (keepLooping) {
               System.out.println("Enter a 1 to double your number. Enter a 2 to halve your number. Enter a 3 to end the loop.");
               String choice = scan.nextLine();
               if (choice.equals("1")){
                   double dub2= dub*2;
                   System.out.println("Your number doubled is " + dub2);
               } else if (choice.equals("2")){
                   double dub3 = dub/2;
                   System.out.println("Your number halved is " + dub3);
               } else if (choice.equals("3")){
                   System.out.println("Ending loop");
                   keepLooping = false;
               } else {
                   System.out.println("Invalid choice. Try 1, 2, or 3.");
           }
       }
       *
           // B)


           boolean keepLooping = true;

           int round = 1;

           while (keepLooping) {
               System.out.println("Enter a positive number. Enter a negative number to quit.");
               String num = scan.next();
               double numd = Double.parseDouble(num);
               if (numd > 0) {
                   System.out.println("Round " + round + ". Your number is " + num);
                   round = round+1;

               } else if (numd < 0) {
                   System.out.println("You quit");
                   keepLooping = false;

               } else {
                   System.out.println("Invalid choice. Enter a positive or negative number");
               }
           }






       // C)
       boolean keepLooping = true;
       int prevInt = -1;
       while (keepLooping) {
           System.out.println("Input a positive integers");
           String num1 = scan.nextLine();

           int num1I = Integer.parseInt(num1);

           if (prevInt < 0) {
               System.out.println("Input a second positive integers");
               String num2 = scan.nextLine();
               int num2I = Integer.parseInt(num2);
               prevInt = num2I;
           } else if (num1I > 0) {
               int div = num1I/prevInt;
               System.out.println(num1I + " is disable by the previous number " + prevInt + " the answer is " + div);
               prevInt = num1I;
           } else if (num1I < 0) {
               System.out.println("You quit");
               keepLooping = false;

           } else {
               System.out.println("Invalid choice. Enter a positive or negative number");
           }

       */


        // D)

        boolean keepLooping = true;
        int playerScore = 0;
        int computerScore = 0;
        int round = 1;
        System.out.println("The score is. Player " + playerScore + ". Computer " + computerScore);

        while (keepLooping) {
            System.out.println("Round " + round);
            System.out.println("Input a positive integers. Press q to exit");
            String playerChoice = scan.nextLine();

            if (playerChoice.equals("q")) {
               keepLooping = false;
                System.out.println("Thanks for playing");
                break;
            }

            int playerNum = Integer.parseInt(playerChoice);
            int computerNum = (int) (1 + 10 * Math.random());
            System.out.println("Player Num is " + playerNum);
            System.out.println("Computer Num is " + computerNum);
            if (playerNum > computerNum) {
                System.out.println("Player wins the round!!!!");
                playerScore = playerScore + 1;
                System.out.println("The score is. Player " + playerScore + ". Computer " + computerScore);
                round = round + 1;

            } else if (playerNum < computerNum) {
                System.out.println("Computer wins the round!!!!");
                playerScore = computerScore + 1;
                System.out.println("The score is. Player " + playerScore + ". Computer " + computerScore);
                round = round + 1;
            } else if (playerNum == computerNum) {
                System.out.println("This is a tie!!!");
                round = round + 1;

            }
        }
    }
}