import java.util.Scanner;

public class Lesson_10_Chars {
        public static void main(String[] args) {

 /*
        int letterVal = 'c';
        System.out.println(letterVal);

 */
            Scanner scan = new Scanner(System.in);

            System.out.println("Give a word: ");
            String userWord = scan.nextLine();

            // program 1: max value / highest letter
            int currentVal = 0;
            char currentChar = 'a';
            int newVal = 0;
            for (int i = 0; i<userWord.length(); i++){
                char newChar = userWord.charAt(i);
                newVal = newChar;
                if (newVal > currentVal){
                    currentVal = newVal;
                    currentChar = newChar;
                }
            }
            System.out.println("A) The highest letter is \"" + currentChar + "\"");

            // program 2: min value / lowest letter
            currentVal = 1000;
            currentChar = 'z';
            for (int i = 0; i<userWord.length(); i++){
                char newChar = userWord.charAt(i);
                newVal = newChar;
                if (newVal < currentVal){
                    currentVal = newVal;
                    currentChar = newChar;
                }
            }
            System.out.println("B) The lowest letter is \"" + currentChar + "\"");

            // program 4: largest difference
            int largestDiff = 0;
            char c1 = ' ';
            char c2 = ' ';
            for (int i = 0; i<userWord.length()-1; i++){
                char newChar = userWord.charAt(i);
                char newChar2 = userWord.charAt(i+1);
                int val1 = newChar;
                int val2 = newChar2;
                if (Math.abs(val2-val1)>largestDiff){
                    c1 = newChar;
                    c2 = newChar2;
                    largestDiff = Math.abs(val2-val1);
                }
            }
            System.out.println("C) The largest adjacent difference is between " + c1 + " and " + c2);
            System.out.println("   A difference of " + largestDiff + " letters");

            // program 5: longest increasing substring
            String curSub = "";
            String longestSub = "";
            for (int i = 0; i<userWord.length(); i++){
                curSub = "";
                char newChar = userWord.charAt(i);
                curSub += newChar;
                for (int j = i+1; j < userWord.length(); j++){
                    char newChar2 = userWord.charAt(j);
                    int val2 = newChar2;
                    int val1 = newChar;
                    if (val2 > val1){
                        curSub += newChar2;
                        if (curSub.length() > longestSub.length()){
                            longestSub = curSub;
                        }
                        newChar = newChar2;
                    } else {
                        break;
                    }
                }
            }
            System.out.println("D) The longest increasing substring is " + longestSub);

            // program 3: sorting the word
            currentChar = 'a';
            int charIndex = 0;
            String tempWord = userWord;
            String newWord = "";
            for (int j = 0; j<userWord.length(); j++) {
                currentVal = 0;
                for (int i = 0; i < tempWord.length(); i++) {
                    char newChar = tempWord.charAt(i);
                    newVal = newChar;
                    if (newVal > currentVal) {
                        currentVal = newVal;
                        currentChar = newChar;
                        charIndex = i;
                    }
                }
                // remove the highest letter
                tempWord = tempWord.substring(0, charIndex) + tempWord.substring(charIndex + 1);
                // add letter to new word
                newWord += currentChar;
            }
            System.out.println("E) The sorted word is: " + newWord);
        }
}

