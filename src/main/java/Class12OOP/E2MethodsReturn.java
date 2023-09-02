package Class12OOP;

/*import java.util.Scanner => This means that the Scanner class is present in another package and thus
has to be imported*/

public class E2MethodsReturn {

   /* A public method is a method that can be accessed outside the class.
   When we use the void keyword, we cannot store the final result when we call the method.
   i.e., the void method does not return a value (return type is void).
    In order to return a value, we must specify the data type and the return statement.
    The return keyword is a keyword used to return a value from a method. When the return statement
    has been executed, we will exit the method. The statements that follow after the return statement
    will become unreachable.

    Sometimes, the return statement can be used in the void method. e.g., we might have a condition and
    if this condition is true, we want to exit the void method. Note: we cannot return a value that is
    incompatible with the type of the method. e.g., trying to return an integer in a void method,
    or trying to return a string in an int method.

    When we use the static keyword, it means that we will be able to call the method from
     inside the main method. The part such as "int add (num1, num2)" is called the
     header of the method. It contains the type, name and parameters of the method
     The curry brackets represent the block of code or logic to be executed for that method.
     Value returning methods is a type of method that returns a value. The return type is the
     type of the data that will be returned.*/
     int add (int num1, int num2) {
        int sum=num2+num1;
         /* The data type in the method declaration must be the
         same as the data type returned in the return statement*/
    return sum;// Returns the result "sum" so it can be accessed by different objects or other classes.

     }

     // Class12 Task2: create a method which takes a number and multiplies it with 10
    //and returns the results
     int Tenmultiplier (int num) {
         int result=num*10;
         return result;// Returns the result "sum" so it can be accessed by different objects or other classes.
     }

     // Class12 Task3: create a method which takes two int numbers
    // and return the largest number. Call the method in a different class.
    int getLargest (int num1, int num2) {
         int larger=0;
        if (num1 != num2) {
            if (num1 > num2) {
                larger=num1;
            } else {
                larger=num2;
            }
        }
        return larger;
    }


    // Class12 Task4:
    String createEmail (String firsName,String lastName, String emailType) {
        String emailAddres="";
       emailAddres=firsName+lastName+"@"+emailType+".com";
        return emailAddres;
    }


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

