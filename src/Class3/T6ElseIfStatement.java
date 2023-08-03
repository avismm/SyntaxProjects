package Class3;

public class T6ElseIfStatement {
    public static void main(String[] args) {
        int number = 0;
        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println("You provided an invalid number");
        }
    }
}
