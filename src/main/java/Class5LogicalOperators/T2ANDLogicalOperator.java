package Class5LogicalOperators;

import java.util.Scanner;

// using a method that ignores the case of the word
public class T2ANDLogicalOperator {
 /*   Write a program that checks if the country is not equal to China*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        double height=input.nextDouble();
        if(height<60){
            System.out.println("You are short");
        }else if(height>=60&&height<=72){
            System.out.println("You are medium");
        }else if(height>72){
            System.out.println("You are tall");
        }


    }
}
