package Class5;

import java.util.Scanner;

public class T3SwitchStatement {
    public static void main(String[] args) {
Scanner input =new Scanner(System.in);
        System.out.println("Enter Num1");
        int num1=input.nextInt();
        System.out.println("Enter Num2");
        int num2=input.nextInt();
        System.out.println("Enter The Operator");
        char operator=input.next().charAt(0);
               switch(operator){
            case '+':
                System.out.println("The result is "+(num1+num2));
                break;
            case '-':
                System.out.println("The result is "+(num1-num2));
                break;
            case '*':
                System.out.println("The result is "+(num1*num2));
                break;
            case '/':
                System.out.println("The result is "+(num1/num2));
                break;
              default:
                System.out.println("One or more inputs were invalid");

        }
    }
}
