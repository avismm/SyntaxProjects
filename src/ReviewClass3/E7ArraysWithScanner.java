package ReviewClass3;

import java.util.Arrays;
import java.util.Scanner;

public class E7ArraysWithScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the array size");
        int size=input.nextInt();
        int[] numbers=new int[size];

        System.out.println("Enter the array numbers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=input.nextInt();
        }
        System.out.println("You entered these numbers");
        System.out.println(Arrays.toString(numbers));// This method returns a string representation of the contents of the specified int array.

    }
}
