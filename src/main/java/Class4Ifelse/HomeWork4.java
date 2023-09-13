package Class4Ifelse;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a credit card");
        char card = input.next().charAt(0);//taking an input from the user
        if (card == 'N') {
            System.out.println("You have been offered");
        } else if (card == 'Y') {
            System.out.println("What is the balance on the card?");
            double balance = input.nextDouble();
            if (balance > 1000) {
                System.out.println("You should pay off immediately");
            } else {
                System.out.println("You can spend more");
            }

        }

    }
}
