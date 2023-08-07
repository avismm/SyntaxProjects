package Class6;

import java.util.Scanner;

public class T12ForLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int i=input.nextInt();
        do{
            System.out.print(i+" ");
            i-=2;
        }while(i>=1);

    }
}
