package Class6Operators;

import java.util.Scanner;

public class E5WhileLoop {
    public static void main(String[] args) {
        //with the do while, we will always execute the block of code at least once
        Scanner input=new Scanner(System.in);
        int num1;
        System.out.println("Enter a number");
        num1= input.nextInt();
        //With the while loop, the condition is checked before execution of the statement happens.
        while(num1<=10){
            System.out.println(num1);
            ++num1;
           }

    }
}
