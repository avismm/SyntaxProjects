package ReviewClass11;

public class Replit213ExceptionHandling1 {
    public void checkTemperature(double temperature) throws FreezingException {
        if (temperature < 32.0) {
            throw new FreezingException("It is freezing");
        }
    }

    class FreezingException extends Exception {
        public FreezingException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Replit213ExceptionHandling1 tempCheck = new Replit213ExceptionHandling1();

        try {
            tempCheck.checkTemperature(28.0);  // This will throw the exception
            System.out.println("Temperature is acceptable");
        } catch (FreezingException e) {
            System.out.println("FreezingException: " + e.getMessage());
        }

        try {
            tempCheck.checkTemperature(36.0);  // This will not throw an exception
            System.out.println("Temperature is acceptable");
        } catch (FreezingException e) {
            System.out.println("FreezingException: " + e.getMessage());
        }
    }
}
