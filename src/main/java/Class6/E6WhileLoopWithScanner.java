package Class6;

import java.util.Scanner;

public class E6WhileLoopWithScanner {
    public static void main(String[] args) {
        //while loop executes a block of code as long as its condition remains true
        Scanner input=new Scanner(System.in);
        String name="";
        while(name.isBlank()){
            System.out.println("Enter your name");
            name= input.nextLine();

        }
        System.out.println("Your name is "+name);
    }
}
