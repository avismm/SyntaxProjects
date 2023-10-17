package ReviewClass11;

public class Replit213ExceptionHandling2 {

    public void checkTemperature(double temperature) {
        if (temperature < 32.0) {
            throw new RuntimeException("It is freezing");
        }
    }
    public static void main(String[] args) {
        Replit213ExceptionHandling2 tempCheck = new Replit213ExceptionHandling2();

        try {
            tempCheck.checkTemperature(28.0); // This will throw a RuntimeException
        } catch (RuntimeException e) {
            System.out.println(e);
        }

    }

}
