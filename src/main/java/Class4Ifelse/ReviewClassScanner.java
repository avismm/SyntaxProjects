package Class4Ifelse;

import java.util.Scanner;

public class ReviewClassScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter The Price");
        double price=input.nextDouble();
        System.out.println("Price is "+price);

        if(price>10000){
            System.out.println("I can't buy this item");
        }else{
            System.out.println("Let's buy it");
        }


    }
}
