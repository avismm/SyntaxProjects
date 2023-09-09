package Class19MethodOverloadingAndOverriding;

public class T2Programming {
    public T2Programming() {
        System.out.println("I love programming languages");
    }
    public T2Programming(String text) {
        System.out.println("I love " +text);
    }
    public static void main(String[] args) {
        new T2Programming();
        new T2Programming("Syntax");

    }
}



