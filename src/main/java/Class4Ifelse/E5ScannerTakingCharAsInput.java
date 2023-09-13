package Class4Ifelse;

import java.util.Scanner;

public class E5ScannerTakingCharAsInput {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Your Gender F/M");

        //Applying the char data type
        char gender=input.next().charAt(0);
        if(gender!='M'){
            if(gender!='F'){
                System.out.println("You did not enter the right input");
            }
        }

        System.out.println("Your gender is "+gender);

    }
}
