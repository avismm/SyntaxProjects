package Class29Exceptions;

import java.util.Scanner;

public class E2ExceptionsHandlingTryCatchBlock {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter array size");

       /* If the input operation inside the try block succeeds without any exceptions,
        it means the user has entered a valid integer value, and an array of that size (arr) is created.
        If there is any exception (such as a non-integer input or an input less than zero), the code inside
        the catch block will be executed.*/
        try {
            //plan a
            int size = scanner.nextInt();
            int[] arr = new int[size];
/*
            try: The code within the try block contains the code that might throw exceptions.
            catch (Exception e): This is a catch block that specifies what type of exception to catch.
            In this case, it catches exceptions of type Exception, which is a general base class for all exceptions in Java.
            e: e is a variable that is used to reference the exception that was thrown and caught.
            You can use this variable to access information about the exception, such as the error message or the stack trace.*/

        }catch (Exception e){
            //plan b
            System.out.println("User must only enter positive integer number");
        }
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");

    }

}
