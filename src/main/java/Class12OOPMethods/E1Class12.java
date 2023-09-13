package Class12OOPMethods;

import java.util.Scanner;

public class E1Class12 {

    //takeUserInput => This is the name of the method
    static void takeUserInput () {
        //We are creating the object of Scanner class
        Scanner input = new Scanner(System.in);
        // Using the scanner object we are calling the nextInt method
        System.out.println("Please Enter your name");
        String name = input.nextLine();
        System.out.println("Please Enter your age");
        int age = input.nextInt();
        System.out.println("Your name is "+name+" and you are "+age+"years old");
    }

    public static void main(String[] args) {
        takeUserInput();
        System.out.println("Please enter the details again");





    }
}
