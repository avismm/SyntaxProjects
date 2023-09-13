package Class12OOPMethods;

/*import java.util.Scanner => This means that the Scanner class is present in another package and thus
has to be imported*/

public class T1Methods {


    void greaterThan(int number1, int number2) {
        if (number1 != number2) {
            if (number1 > number2) {
                System.out.println(number1 + " is greater than " + number2);
            } else {
                System.out.println(number2 + " is greater than " + number1);
            }
        }
        System.out.println("number1 and number2 are equal");
    }


    void evenOdd(int number) {
        if (number % 2 != 0) {
            System.out.println(number + " is odd number");
        } else {
            System.out.println(number + " is an even number");
        }
    }


    void palindrome(String word1) {
        String word2 = "";
        for (int i = word1.length() - 1; i >= 0; i--) {
            word2 = word2 + word1.charAt(i);
        }
        System.out.println("Is the word "+word1+ " palindrome?: " + word2.equals(word1));
    }
}

