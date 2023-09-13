package Class4Ifelse;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("What is the city");
        String city =input.nextLine();//taking an input from the user
        System.out.println("What the temperature");
        double temperatureFahrenheit =input.nextDouble();
        double temperatureCelsius;

        temperatureCelsius=(temperatureFahrenheit-32)*5/9;
        System.out.println("The temperature of " +city+ " is "+temperatureCelsius);
    }
}
