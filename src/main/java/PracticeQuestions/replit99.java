package PracticeQuestions;

import java.util.Scanner;

public class replit99 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below
        String reversed = new StringBuilder(givenString).reverse().toString();
        if(givenString.equalsIgnoreCase(reversed)){

        }
    }


}
