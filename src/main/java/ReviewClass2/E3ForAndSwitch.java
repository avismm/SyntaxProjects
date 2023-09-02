package ReviewClass2;

import java.util.Scanner;

public class E3ForAndSwitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
        System.out.println("Please enter the name of the fruit");
        String fruitName=input.nextLine();

                switch (fruitName){
            case "Banana":
                System.out.println("Yellow Bananas are good");
                break;
            case "Orange":
                System.out.println("It is usually Orange");
                break;
            case "Blue berry":
                System.out.println("Yellow Bananas are good");
                break;
            default:
                System.out.println("I dont like this fruit");

        }
        }

        }




}
