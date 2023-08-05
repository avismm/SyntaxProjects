package Class5;

import java.util.Scanner;

public class T2SwitchStatement {
    public static void main(String[] args) {
Scanner input =new Scanner(System.in);
        System.out.println("Enter Your Grade");
        char grade=input.next().charAt(0);

        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Bad");
                break;
              default:
                System.out.println("Not Acceptable");

        }
    }
}
