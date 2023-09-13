package Class5LogicalOperators;

import java.util.Scanner;

// using a method that ignores the case of the word
public class E5ORLogicalOperator {
 /*   Write a program that checks if the country is not equal to China*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your origin country");
        String country=input.nextLine();
        if(!country.equalsIgnoreCase("China")){
            System.out.println("Welcome, you are allowed");
        }else{
            System.out.println("You are not allowed");
        }

    }
}
