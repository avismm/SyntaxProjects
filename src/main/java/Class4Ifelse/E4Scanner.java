package Class4Ifelse;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please Enter Your Name");
        /*creating the object of the scanner class so that we can reuse the
        logic from this class which is already written for us by Java
        developers*/
        Scanner input=new Scanner(System.in);

        //taking an input from the user and storing in int a name variable
        String name=input.next();

        //Conditions to apply to the user inputs
        if(name.equals("Avis")){
            System.out.println("You are a Java Instructor");
        }else {
            System.out.println("I don't know you");
        }
        //System.out.println("Hello "+name);
    }
}
