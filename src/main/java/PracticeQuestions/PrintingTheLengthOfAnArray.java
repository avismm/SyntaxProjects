package PracticeQuestions;

import java.util.Scanner;

public class PrintingTheLengthOfAnArray {
    public static void main(String[] args) {
        /*//only creating an array
        Java will initialize everything with zero for integers and null with strings
        =>Char will be initialized with null
        =>boolean wil be initialized with false*/
      
        Scanner input=new Scanner(System.in);
        String [] names= new String[5];
        names[0]="School";
        names[1]="Car";
        names[2]="Cats";
        names[3]="Vans";
        names[4]="Hospital";
        System.out.println(names.length);
        System.out.println(names[0].length());

    }
}
