package Class6Operators;

import java.util.Scanner;

public class E1DoLoop {
    public static void main(String[] args) {
        //with the do while, we will always execute the block of code at least once
        Scanner input=new Scanner(System.in);
        String name="";
        do{
            System.out.println("Enter your name");
            name= input.nextLine();
        }while(name.isBlank());
        System.out.println("Your name is "+name);
    }
}
