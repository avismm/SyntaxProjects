package Class11OOP;

import java.util.Scanner;

/*Write a program that reads two people's first
        names and if they expecting boy or girl?
        Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL*/
public class T3StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Mum's first Name");
        String mumFirstName = input.nextLine();
        System.out.println("Please enter Dad's first Name");
        String dadFirstName = input.nextLine();
        System.out.println("Boy or Girl?");
        String boyGirl = input.nextLine();
        String babyName1 = "";
        String babyName2 = "";

        if (boyGirl.equals("boy")) {
            babyName1 = dadFirstName.substring(0, 3);
            babyName2 = mumFirstName.substring(0, 2);
            System.out.println(babyName1 + babyName2);

        } else if (boyGirl.equals("girl")) {
            babyName1 = mumFirstName.substring(0, 3);
            babyName2 = dadFirstName.substring(0, 2);
            System.out.println("The suggested baby name is "+ babyName1 + babyName2);
        }

    }

}

