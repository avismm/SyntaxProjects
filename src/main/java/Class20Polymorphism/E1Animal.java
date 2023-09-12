package Class20Polymorphism;

public class E1Animal {

    void speak(){
        System.out.println("Animals can speak");
    }
    void sleep(){
        System.out.println("Animals can sleep");
    }
    void eat(){
        System.out.println("Animals can eat");
    }
}
class Dog extends E1Animal {
    @Override
    void speak(){
        System.out.println("Wuff wuff");
    }

}
class Cat extends E1Animal {
    @Override
    void speak() {
        System.out.println("Neow Neow");
    }
}
