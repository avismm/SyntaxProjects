package Class5LogicalOperators;

import java.util.Scanner;

// using a method that ignores the case of the word
public class T3ANDLogicalOperator {
 /*   Write a program that checks if the country is not equal to China*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a day of the week");
        int day=input.nextInt();
        if(day==1||day==2||day==3||day==4||day==5){
            System.out.println("It is a weekday");
        }else if(day==6||day==7){
            System.out.println("It is a weekend");
        }else {
            System.out.println("You've entered an invalid day");
        }


    }
}
