package Class19MethodOverloadingAndOverriding;

public class T3MethodOverloading {
    public static void printInfo() {
        System.out.println("I love programming languages");
    }

    public static void printInfo(String text) {
        System.out.println("I love " + text);
    }

    public static void printInfo(String text1, String text2) {
        System.out.println("I love " + text2+" and " +text1);
    }

    public static void main(String[] args) {
        T3MethodOverloading.printInfo();
        T3MethodOverloading.printInfo("Syntax","Java");
        T3MethodOverloading.printInfo("Java");
    }
}



