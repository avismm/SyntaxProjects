package Class17;

public class AnimalTesterClass {
    public static void main(String[] args) {
        // Java creates a default constructor;
        Cat c=new Cat();
        c.name="Tom";
        c.breed="Russian";
        c.color="white";
        c.age=1;
        c.attitude=true;
        c.printInfo();

        Dog d=new Dog();
        d.name="Tom";
        d.breed="Russian";
        d.color="white";
        d.age=1;
        d.printInfo();
        d.bark();

        //Animal class can also be used independently
        Animal a =new Animal();
        a.name="Jim";
        a.color="black";
        a.printInfo();
    }
}
