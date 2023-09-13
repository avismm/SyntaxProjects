package Class12OOPMethods;

/*import java.util.Scanner => This means that the Scanner class is present in another package and thus
has to be imported*/

import java.util.Scanner;

public class T2PrimeNumber {


    int primeNo(int number) {
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("Please enter a number greater than 1"); // Prime numbers must be positive and greater than 1
            number=input.nextInt();
        }while(number<=1); // Repeats the loop if the input was less than zero or equal to 1

        boolean prime = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                prime = true;
                break;
            }
        }
        if (!prime) {
            System.out.println(number + " is a prime number.");
        }else
            System.out.println(number + " is not a prime number.");
        return number;
    }
}

