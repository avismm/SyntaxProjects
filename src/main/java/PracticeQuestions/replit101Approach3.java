package PracticeQuestions;

import java.util.Scanner;

public class replit101Approach3 {
    public static void main(String[] args) {
       // Inputs:
        //
        //```
        //String word;
        //```
        //
        //Write a for loop that will print out every other letter in a String, starting with the first letter.  These letters should be printed all on one line with no space in between.
        //
        //
        //Sample input/outputs
        //
        //```
        //In: hello
        //hlo
        //```
        //
        //```
        //In: SSyynnttaaxxTTeecchhnnoollooggiieess
        //SyntaxTechnologies
        //```
        Scanner input =new Scanner(System.in);
        System.out.print("In:");
        String word =input.nextLine();

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                // Check if the current character is not equal to the next character
                if (i == word.length() - 1 || currentChar != word.charAt(i + 1)) {
                    result.append(currentChar);
                }
            }

            System.out.println(result.toString());
        }
         

        }



