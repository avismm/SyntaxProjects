package PracticeQuestions;

import java.util.Scanner;

public class replit105PrintingOnlyVowelsRegex {
    public static void main(String[] args) {
        /*Create an array of names that will hold 5 String elements.

Names must be taking from a user.

Print out the first three characters of each element of the array, one per line.

Note: every array element must be at least 3 characters long. */
      
        Scanner input=new Scanner(System.in);
        String word= "";
                System.out.println("Please enter a word");
                word = input.nextLine();
           System.out.println(word.replaceAll("[^aeiouAEOU]",""));
    }
}
