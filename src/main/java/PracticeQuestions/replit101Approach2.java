package PracticeQuestions;

import java.util.Scanner;

public class replit101Approach2 {
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

            String[] strs= word.split("");
        for (int i = 0; i < strs.length; i++) {
            if(i%2==0){
                System.out.println(strs[i]);
            }

        }

        }
         

        }



