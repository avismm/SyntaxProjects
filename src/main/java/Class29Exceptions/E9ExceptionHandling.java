package Class29Exceptions;

public class E9ExceptionHandling {
    public static void printException() throws java.io.FileNotFoundException {
        throw new java.io.FileNotFoundException(" (No such file or directory)");
    }

    public static void main(String[] args) {
        try {
            printException();
        } catch (java.io.FileNotFoundException e) {
            // Print the class name and error message
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}
