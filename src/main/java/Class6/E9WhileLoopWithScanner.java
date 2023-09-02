package Class6;

import java.util.Scanner;

public class E9WhileLoopWithScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the starting point");
        int start= input.nextInt();
        System.out.println("Enter the ending point");
        int end= input.nextInt();
        System.out.println("Enter the step as well");
        int step= input.nextInt();
        while(start<=end){
            System.out.print(start+" ");
            start+=step;
           }

    }
}
