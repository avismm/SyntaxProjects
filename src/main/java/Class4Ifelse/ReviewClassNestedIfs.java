package Class4Ifelse;

import java.util.Scanner;

public class ReviewClassNestedIfs {
    /*
    Example:
    if age is greater than 60 offer a 20% discount
    if age is greater than 50 offer 15% discount
    if age is greater than 40, offer 10%
    no discounts

    if the if statements are dis-joined (written separately), the program wll
    will execute redundant code and may slow down

     NESTED IFs;
     nested if conditions are used to test conditions which are
     dependent on one another.

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is the day today?");
        String day=input.nextLine();
        System.out.println("What is your account balance?");
        double accountBalance=input.nextDouble();

//
        if(day.equals("sunday")){
            if(accountBalance>2000){
                System.out.println("We can buy this");
            }else{
                System.out.println("It is too expensive");
            }

        }else if(day.equals("saturday")){
            System.out.println("It is saturday. Lets go for dinner");

        } else {
            System.out.println("lets wait for Sunday");
        }


    }
}
