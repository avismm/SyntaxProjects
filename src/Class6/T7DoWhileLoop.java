package Class6;

import java.util.Scanner;

public class T7DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the starting point");
        int input;

        do {
            System.out.println("Please enter a number or -1 to terminate");
            input = scanner.nextInt();
            System.out.print("You have entered " + input);
        }while(input!=-1);

    }
}
