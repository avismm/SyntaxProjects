package Class6;

import java.util.Scanner;

public class E2DoLoop {
    public static void main(String[] args) {
        //with the do while, we will always execute the block of code at least once
        Scanner input=new Scanner(System.in);
        int num1;
        System.out.println("Enter a number");
        num1= input.nextInt();
        do{
            System.out.println(++num1);
           }while(num1<=10);

    }
}
