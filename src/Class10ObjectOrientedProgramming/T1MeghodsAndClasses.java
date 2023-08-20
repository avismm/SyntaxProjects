package Class10ObjectOrientedProgramming;

import java.util.Scanner;

public class T1MeghodsAndClasses {
    public static void main(String[] args) {

       Scanner input=new Scanner(System.in);
       String username="";
        String password="";
        String confirmPass="";

        System.out.println("username");
        username=input.nextLine();
        if(username.isEmpty())
            System.out.println("Username or password cannot be empty");

        System.out.println("password");
        password =input.nextLine();
        if(password.isEmpty()) {
            System.out.println("Username or password cannot be empty");
        }else if(password.length()<8){
            System.out.println("Password is too short");
        }else if (password.contains(username)){
            System.out.println("Password cannot contain username");
        }else
        System.out.println("confirm password");
        confirmPass =input.nextLine();
        if (!confirmPass.equals(password)){
            System.out.println("passwords must match");
        }else {
            System.out.println("Your account has been created");

        }


        
    }
}