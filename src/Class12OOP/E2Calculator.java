package Class12OOP;

/*import java.util.Scanner => This means that the Scanner class is present in another package and thus
has to be imported*/
import java.util.Scanner;

public class E2Calculator {

    /*add => name of the class
    () => if a method requires an input from the user, we add it inside the braces*/
    void add () {
        //We are creating the object of Scanner class
        Scanner input = new Scanner(System.in);
        // Using the scanner object we are calling the nextInt method
        System.out.println("Please Enter the first number");
        int num1 = input.nextInt();
        System.out.println("Please Enter the second number");
        int num2 = input.nextInt();
        int sum=num2+num1;
        System.out.println("Sum of these numbers is "+sum);
    }

    void subtract () {
        //We are creating the object of Scanner class
        Scanner input = new Scanner(System.in);
        // Using the scanner object we are calling the nextInt method
        System.out.println("Please Enter the first number");
        int num1 = input.nextInt();
        System.out.println("Please Enter the second number");
        int num2 = input.nextInt();
        int difference=num1-num2;
        System.out.println("The difference of these numbers is "+difference);
    }
  /*  void multiply(){
        int number1=10;
        int number2=20;
        int result=number1*number2;
        System.out.println(result);
    }*/

    /*By parameterizing the method, Java will multiply any values
    specified*/
    void multiply(int number1, int number2){
        int result=number1*number2;
        System.out.println(result);
    }

}
