package Class4;

import java.util.Scanner;

public class E6ScannerTakingStringsAsInput {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Your Full Names");

        //Applying the char data type
        String name=input.nextLine();
        System.out.println("Your full name is "+name);


    }
}
