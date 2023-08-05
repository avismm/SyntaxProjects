package Class5;

import java.util.Scanner;

// using a method that ignores the case of the word
public class T1NOTLogicalOperator {
 /*   Write a program that checks if the country is not equal to China*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your birth month");
        String month=input.next();
        if(month.equalsIgnoreCase("mar")||month.equalsIgnoreCase("apr")|| month.equalsIgnoreCase("may")){
            System.out.println("You were born in spring");
        }else if(month.equalsIgnoreCase("jun")||month.equalsIgnoreCase("jul")|| month.equalsIgnoreCase("aug")){
            System.out.println("You were born in Summer");
        }else if(month.equalsIgnoreCase("sept")||month.equalsIgnoreCase("oct")|| month.equalsIgnoreCase("nov")) {
            System.out.println("You were born in Autumn");
        }else{
            System.out.println("You did not enter a valid month");
        }
    }
}
