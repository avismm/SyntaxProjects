package ReviewClass9;

public abstract class Animal2Abstraction {
    abstract void eat();
    abstract void speak();
}

class Rat extends AnimalPolymorphism {
    @Override
    void eat() {
        System.out.println("Dogs like to eat");
    }

    @Override
    void speak() {
        System.out.println("Dogs like to bark");
    }
}

class Pig extends AnimalPolymorphism {
    @Override
    void eat() {
        System.out.println("Cats don't eat");
    }

    @Override
    void speak() {
        System.out.println("Cats like to speak maooo");
    }
}

