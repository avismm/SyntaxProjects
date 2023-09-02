package ReviewClass2;

import java.util.Scanner;

public class E5DoWhileLoops {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
            int i = 62;
            int sum=0;
            do {
                System.out.println("Please enter the price of item or -1 to terminate");
               i=input.nextInt();
               if(i!=-1){
                sum=sum+i;}
                System.out.println("Your total bill is "+sum);
            }while (i!=-1);

    }




}
