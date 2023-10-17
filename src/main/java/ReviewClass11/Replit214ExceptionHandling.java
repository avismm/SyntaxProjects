package ReviewClass11;

/***
This code defines a class Replit214ExceptionHandling with a method checkGrade that throws a
 custom exception SyntaxStudentException when a student's grade is greater than 90.
 The main method creates an instance of the Main class,
calls checkGrade with a grade of 98, and handles the exception if it is thrown.
When the grade is 98 (which is greater than 90), it will throw a SyntaxStudentException,
and the message "SyntaxStudentException: You are an exceptionally awesome student"
 will be printed. Otherwise, when the grade is less than or equal to 90, it will print "You are a great student."
*/
public class Replit214ExceptionHandling {
    public void checkGrade(double studentGrade) throws SyntaxStudentException {
        if (studentGrade >90.0) {
            throw new SyntaxStudentException("You are an exceptionally awesome student");
        }
    }
    class SyntaxStudentException extends Exception {
        public SyntaxStudentException(String message) {
            super(message);
        }
    }
    public static void main(String[] args) {
        Replit214ExceptionHandling grade = new Replit214ExceptionHandling();

        try {
            grade.checkGrade(98);
            System.out.println("You are a great student");
        } catch (SyntaxStudentException e) {
            System.out.println("SyntaxStudentException: " + e.getMessage());
        }

    }
}
