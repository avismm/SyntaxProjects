package Class6Operators;

import java.util.Scanner;

public class E7DoLoopWithScanner {
    public static void main(String[] args) {
        //while loop executes a block of code as long as its condition remains true
        Scanner input=new Scanner(System.in);
        int num1;
        do {
            System.out.println("Enter your number");
            num1= input.nextInt();
        }while (num1<1 || num1>10);
       System.out.println(num1+" is between 1 and 10");

    }
}
