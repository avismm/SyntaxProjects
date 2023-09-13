package Class6Operators;

import java.util.Scanner;

public class E10WhileLoopWithScanner {
    public static void main(String[] args) {
        //while loop executes a block of code as long as its condition remains true
        Scanner input=new Scanner(System.in);
        String name;
        do {
            System.out.println("Enter your name");
            name= input.nextLine();

        }while (name.isBlank());
        System.out.println("Your name is "+name);
    }
}
