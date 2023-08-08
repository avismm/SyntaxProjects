package Class6;

import java.util.Scanner;

public class HomeWork035 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Do you need a loan");
        boolean loan=input.nextBoolean();
        String eligibility="";

        if(loan){
            System.out.println("What is your credit score?");
            double creditScore=input.nextDouble();

            if(creditScore<600){
                eligibility = "Not elgible";
            }
            if(creditScore>=600&&creditScore<=700){
                eligibility ="May be eligible";
            }
            if(creditScore>=701&&creditScore<=800){
                eligibility ="Eligible";
            }
            if(creditScore>800){
                eligibility ="Definitely eligible";
            }
            System.out.println("The eligibility is"+" "+ eligibility);

        }else {
            System.out.println("Unknown");
        }

    }
}
