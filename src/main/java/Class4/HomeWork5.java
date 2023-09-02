package Class4;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("How many years have you worked");
        int workedYears =input.nextInt();//taking an input from the user
        System.out.println("What is your annual salary");
        double annualSalary =input.nextDouble();
        if(workedYears>=5){
            System.out.println("You are eligible for bonus");
            if(annualSalary>50000){
                System.out.println("Your bonus is "+5000);
            }else{
                System.out.println("Your bonus is "+3000);
            }
        }else{
            System.out.println("You are not eligible for bonus");
        }

    }
}
