package Class4Ifelse;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("What amount of loan do you need?");
        double loan =input.nextDouble();
if(loan<=200000){
    System.out.println("We can lend you money");
}else{
    System.out.println("Your application was rejected");
}
    }
}
