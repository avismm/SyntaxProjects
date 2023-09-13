package Class5LogicalOperators;

import java.util.Scanner;

public class T1SwitchStatement {
    public static void main(String[] args) {
Scanner input =new Scanner(System.in);
        System.out.println("Enter the country");
        String country=input.nextLine();
        country=country.toLowerCase();

        switch(country){
            case "Japan":
                System.out.println("Japanese");
                break;
            case "India":
                System.out.println("Indian");
                break;
            case "Uganda":
                System.out.println("Luganda");
                break;
                case "China":
                System.out.println("Chinese");
                break;
            case "UK":
                System.out.println("English");
                break;
            default:
                System.out.println("You must enter a country");

        }
    }
}
