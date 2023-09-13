package Class4Ifelse;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("What is your age");
        double age =input.nextDouble();//taking an input from the user
if(age>=18){
    System.out.println("You are eligible for a driver license");
}else{
    System.out.println("You are eligible for a learner's permit");
}
    }
}
