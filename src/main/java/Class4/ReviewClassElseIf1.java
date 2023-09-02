package Class4;

import java.util.Scanner;

public class ReviewClassElseIf1 {
    /*
    Example:
    if age is greater than 60 offer a 20% discount
    if age is greater than 50 offer 15% discount
    if age is greater than 40, offer 10%
    no discounts
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age to calculate the discount");
        int age=input.nextInt();
        System.out.println("Age is "+age);

        if(age>60){
            System.out.println("You get 20% dicsount");
        }else if(age>50){
            System.out.println("You get 15% discount");
        }else if(age>40){
            System.out.println("You get 10% discount");
        }else {
            System.out.println("No discount for you please try after 10 years");
        }


    }
}
