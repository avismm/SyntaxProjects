package Class6Operators;

import java.util.Scanner;

public class T6DoWhileLoop {
    public static void main(String[] args) {
        //printing even numbers between 2 and 20 using ghe do while
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the starting point");
        int start= input.nextInt();
        System.out.println("Enter the ending point");
        int end= input.nextInt();
        System.out.println("Enter the step as well");
        int step= input.nextInt();
        do{
            System.out.print(start+" ");
            start+=step;
           }while(start<=end);

    }
}
