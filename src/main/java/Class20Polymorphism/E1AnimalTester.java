package Class20Polymorphism;

public class E1AnimalTester {
    public static void main(String[] args) {
        Dog d=new Dog();

        // Calling the speak method from the Dog class
        d.speak();

        //Calling the generic methods from te parent
        d.eat();
        d.sleep();
    }

}
