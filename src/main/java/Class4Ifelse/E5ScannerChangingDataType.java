package Class4Ifelse;

import java.util.Scanner;

public class E5ScannerChangingDataType {
    public static void main(String[] args) {
        System.out.println("Please Enter Your Age");
        Scanner input=new Scanner(System.in);

        /*Changing the data type for the user input
        does not apply for Char and
        */
        int age=input.nextInt();

        System.out.println("Your age is "+age);

    }
}
