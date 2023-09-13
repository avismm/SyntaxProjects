package Class4Ifelse;

import java.util.Scanner;

public class E6ScannerTakingStringsAsInput {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Your Full Names");

        //Applying the char data type
        String name=input.nextLine();
        /*note the nextLine takes more than one word. If we use next(), other words will be kept in a buffer.
        this may cause an issue if the user wanted to enter more than one input of a different data type
        i.e., the system assigns the next word that was originally stored in the buffer, to the next input variable/*
        System.out.println("Your full name is "+name);*/
    }
}
