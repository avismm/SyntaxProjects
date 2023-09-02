package Class4;

import java.util.Scanner;

public class E7ScannerAllClassmatesProgram {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Your Full Names");

        //Applying the char data type
        String name=input.nextLine();
        if(name.equals("Avis")){
            System.out.println("I live in HCM");
        }else if(name.equals("Aisha")){
            System.out.println("I live in USA");
        }else if (name.equals("Jamil")){
            System.out.println("I love Java");
        }else if (name.equals("Ketra")) {
            System.out.println("I love Football");
        }else if (name.equals("Sam")) {
            System.out.println("I love Football");
        }



    }
}
