package Class18Inheritence;

public class CarTester {
    public static void main(String[] args) {
        BMW i8=new BMW("BMW","i8","black",4566);
        i8.printInfo();

        Audi a=new Audi("BMW","i8","black",4566, true);
        a.printInfo();

    }
}
