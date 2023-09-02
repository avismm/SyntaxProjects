package Class8;

import java.util.Scanner;

public class E6BreakKeyWord {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Please enter the price of the item or -1 to terminate");
            double price=input.nextDouble();
            System.out.println("Please Enter the number of items or -1 to terminate");
            double total=input.nextDouble();
            if (price==-1 || total==-1){
                break;
            }else{
                total =total*price;
            }
            System.out.println("Your total bill is "+total);
        }

    }
}
