package ReviewClass9;

public class AnimalPolymorphism {
    String name;
    String color;

    void eat(){
        //System.out.println("animals eat");

    }
    void speak(){
       // System.out.println("Animals speak");
    }
}

class Dog extends AnimalPolymorphism {
    @Override
    void eat() {
        System.out.println("Dogs like to eat");
    }

    @Override
    void speak() {
        System.out.println("Dogs like to bark");
    }
}

class Cat extends AnimalPolymorphism {
    @Override
    void eat() {
        System.out.println("Cats don't eat");
    }

    @Override
    void speak() {
        System.out.println("Cats like to speak maooo");
    }
}
