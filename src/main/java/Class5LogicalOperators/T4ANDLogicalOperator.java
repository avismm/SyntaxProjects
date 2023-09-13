package Class5LogicalOperators;

import java.util.Scanner;

// using a method that ignores the case of the word
public class T4ANDLogicalOperator {
 /*   Write a program that checks if the country is not equal to China*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=input.nextInt();
        if(number>=1&&number<=10){
            System.out.println("This is a small number");
        }else if(number>=11&&number<=100){
            System.out.println("This is a medium number");
        }else if(number>=101&&number<=1000) {
            System.out.println("This is a large number");
        }


    }
}
