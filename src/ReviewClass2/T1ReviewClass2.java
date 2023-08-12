package ReviewClass2;

import java.util.Scanner;

public class T1ReviewClass2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first value");
        boolean value1=input.nextBoolean();
        System.out.println("Enter the second value");
        boolean value2=input.nextBoolean();
        System.out.println(value2&&value1);
    }


}
