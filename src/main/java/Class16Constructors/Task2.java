package Class16Constructors;

public class Task2 {
    private String name;
   private int age;
   private char gender;

   // public Constructor
   public Task2(String name, int age, char gender){

    }
    // private Constructor
    private Task2(){
        System.out.println("Private");

    }

    // protected Constructor
    protected Task2(String name){

    }

    // default Constructor
    Task2(String name, int age){

    }

    public void printInfo(){
        System.out.print(name+", "+age+", "+gender);
    }

    public static void main(String[] args) {
        new Task2("Jerry").printInfo();
        new Task2("Teddy", 56).printInfo();
        new Task2().printInfo();
    }
}
