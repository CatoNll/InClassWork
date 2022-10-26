import java.util.Scanner;

public class Lesson_4_casting_strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        int level = 12;
        //conerts an int data type to a string
        String levelString = Integer.toString(level);
        System.out.println("your level string is " + levelString);

        double pi =3.14159265;
        String piString = Double.toString(pi);

        float radius = 5.678f;
        String radiusString = Float.toString(radius);

        //easier way
        float radius2 = 4.5223f;
        String radius2String = "" + radius2;



        //cenverting Strings into numbers
        String lengthString = "150";
        double value = Double.parseDouble(lengthString);
        float value2 = Float.parseFloat(lengthString);
        int value3 = Integer.parseInt(lengthString);
        //now you can do math with it



        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a 3-digit number: ");
        String three_digit_number1 = scan.nextLine();
        System.out.println("Enter a different 3-digit number: ");
        String three_digit_number2 = scan.nextLine();
        System.out.println(three_digit_number1 + three_digit_number2);

         */
        System.out.println("Enter number: ");
        String num1 = scan.nextLine();
        System.out.println("Enter an other number: ");
        String num2 = scan.nextLine();

        double dub1 = Double.parseDouble(num1);
        double dub2 = Double.parseDouble(num2);

        double dub3 = dub1 + dub2;
        System.out.println(dub3);

    }
}
