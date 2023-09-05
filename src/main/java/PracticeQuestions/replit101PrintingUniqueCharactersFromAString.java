package PracticeQuestions;

import java.util.Scanner;

public class replit101PrintingUniqueCharactersFromAString {
    public static void main(String[] args) {
       // String word = "Hello, world! This is a test.";
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        printUniqueLetters(word);
    }

    public static void printUniqueLetters(String word) {

       /* Here is what this program does
       It imports the Scanner class for user input.

        In the main method, it creates a Scanner object called inp to read input from the console.

        It prompts the user with the message "In:" to enter a string.

        It reads the user's input as a string and stores it in the word variable.

        It calls the printUniqueLetters method with the word as an argument.

                In the printUniqueLetters method:

        It uses the replaceAll method to remove all non-letter characters from the word string. The regular expression [^a-zA-Z] matches any character that is not a lowercase or uppercase letter, effectively removing spaces, digits, and special characters.
        It initializes a StringBuilder called uniqueLetters to build the result string containing unique letters.
        It iterates through each character of the cleaned word string.
        For each character, it checks whether it's already present in the uniqueLetters string using the indexOf method. If the character is not found (index is -1), it appends the character to the uniqueLetters string.
        Finally, it prints out the uniqueLetters string, which contains all unique letters from the cleaned word string, with no spaces between them.*/

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
