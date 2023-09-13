package Class17Inheritance;

public class X {
    String name;
    void printInfo(){
        System.out.println(name);

    }

}

class Y extends X {
    void printInfo(){
        System.out.println(name);

    }

}

class Z extends Y {
    void printInfo(){
        System.out.println(name);

    }

}
