package Class6Operators;

import java.util.Scanner;

public class E4DoLoop {
    public static void main(String[] args) {
        //with the do while, we will always execute the block of code at least once
        Scanner input=new Scanner(System.in);
        int num1;
        System.out.println("Enter a number");
        num1= input.nextInt();
        /*With the do while loop, execution of the statement happens first before the condition is checked.
        so the statement is executed at least once*/
        do{
            System.out.println("Hello "+num1);
            ++num1;
           }while(num1<=10);
        System.out.println("We are done executing the do while for your input");
    }
}
