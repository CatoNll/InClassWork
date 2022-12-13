import java.util.Scanner;

public class Lesson_13_Exception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String value = scan.nextLine();

        int x = 0;
        try {
            x = Integer.parseInt(value);
        } catch (NumberFormatException e){
            System.out.println("error, that is not an integer");
        }
    }
}
