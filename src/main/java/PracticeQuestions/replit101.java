package PracticeQuestions;

import java.util.Scanner;

public class replit101 {
    public static void main(String[] args) {
       // String word = "Hello, world! This is a test.";
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        printUniqueLetters(word);
    }

    public static void printUniqueLetters(String word) {
        word = word.replaceAll("[^a-zA-Z]", ""); // Remove non-letter characters from the string
        StringBuilder uniqueLetters = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (uniqueLetters.indexOf(String.valueOf(letter)) == -1) {
                uniqueLetters.append(letter);
            }
        }

        System.out.println(uniqueLetters.toString());
    }

}
