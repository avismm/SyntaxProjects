package Class19MethodOverloadingAndOverriding;

public class T4MethodOverloading {
    private static void printInfo() {
        System.out.println("I love programming languages");
    }

    private static void printInfo(String text) {
        System.out.println("I love " + text);
    }

    private static void printInfo(String text1, String text2) {
        System.out.println("I love " + text2+" and " +text1);
    }

    public static void main(String[] args) {
        T4MethodOverloading.printInfo();
        T4MethodOverloading.printInfo("Syntax","Java");
        T4MethodOverloading.printInfo("Java");
    }
}



