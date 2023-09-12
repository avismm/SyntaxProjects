package Class20Polymorphism;

public class E5PolyMorph {
    public static void main(String[] args) {
        /*E1Animal a=new E1Animal();
        a.sleep();
        a.speak();
        a.eat();
        Dog d=new Dog();
        Cat c=new Cat();*/

        /*Because of polymorphism, we can create an Animal array from the Animal class and store child classes as elements in the array
        Methods that have an override in the child classes will be called at child class level based on method overriding.
        Polymorphism is therefore achieved with the help of overriding*/
        E1Animal[] arr={new Cat(),new Dog(), new E1Animal()};
        for(E1Animal c:arr){
            c.eat();
            c.sleep();
            c.speak();
        }
    }
}
