public class Lesson_10_Chars {
        public static void main(String[] args) {

 /*
        int letterVal = 'c';
        System.out.println(letterVal);

 */
            String word = "Helzlo";

            char char1 = ' ';

            int letterVal = 0;

            for (int i = 0; i < word.length(); i++) {
                char1 = word.charAt(i);
                letterVal = char1;

                if (letterVal > char1) {
                  System.out.println( "The hight letter is: " + char1);
                  break;

              }
            }
            System.out.println( "The hight letter is: " + char1);
    }
}
