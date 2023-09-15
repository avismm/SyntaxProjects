package ReviewClass8;

public class Parent {
    String name="james";
    void printHello(){
        System.out.println(name);
    }
    Parent(){
        System.out.println("Parent class constructor");

    }
    Parent(String n){
        System.out.println("Parent class constructor with parameter");
    }

}

class Child extends Parent {
   String name="John";
    void printHello(){
        System.out.println("hello Java");
    }
    void test(){
        String name="white";
        System.out.println(super.name); // Java will exclusively prefer the parent variable.
        System.out.println(name); // Java will prefer the child local variable.
        System.out.println(this.name); // Java will prefer the child instance variable.
        System.out.println(name); // Java will prefer the child local variable.
            }

            void methodTest(){
        printHello(); // The instance method from the same class is preferred. However, Java will always first call the parent class constructor
       // super.printHello(); // The instance method from the parent class is preferred
            }
    public Child (String word){
    //super("name"); The parent constructor which has parameter will be called
   // super("word"); //The parent constructor will be called
    }

}