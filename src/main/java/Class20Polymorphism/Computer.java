package Class20Polymorphism;

public class Computer {

    private String name;
    private double storage;
    private String screenSize;
void printing(){
    System.out.println(" Provides a printing function");
}
    void gaming(){
        System.out.println(" Provides a gaming function");
    }
    void internet(){
        System.out.println("compatible with internet");
    }
}
class Apple extends Computer {
    void printing(){
        System.out.println(" Provides a printing and scanning function");
    }

}
class Lenovo extends Computer {
    void gaming(){
        System.out.println(" Provides a game building and high speed gaming capability");
    }
}
class HP extends Computer {
    void gaming(){
        System.out.println(" Provides kids gaming");
    }
}
class Dell extends Computer {

}
