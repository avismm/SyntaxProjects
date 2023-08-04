package Class4;

import java.util.Scanner;

public class ReviewClassElseIf3NextLine {
    /*
    Example:
    if age is greater than 60 offer a 20% discount
    if age is greater than 50 offer 15% discount
    if age is greater than 40, offer 10%
    no discounts
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName=input.next();/*the next method keeps the value in the buffer but, it does not handle the next line.
        so when the user presses te keyboard, the next method will cause the enter action
        to be stored into the buffer(memory) as well. If the next execution involves the nextLine,
        the system will consume the value in the buffer */

        System.out.println("Please enter city");
        String city=input.nextLine(); /*the nextLine skips to the next line and if there is a value in the buffer,
         it will take that value*/
        System.out.println(fullName+" "+city);

       /* if(age>60){
            System.out.println("You get 20% dicsount");
        }else if(age>50){
            System.out.println("You get 15% discount");
        }else if(age>40){
            System.out.println("You get 10% discount");
        }else {
            System.out.println("No discount for you please try after 10 years");
        }*/


    }
}
