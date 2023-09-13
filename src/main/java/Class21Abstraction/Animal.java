package Class21Abstraction;

public abstract class Animal {
    String name;
    String breed;
    String color;

   /* With abstraction, we can remove the body of the methods in the parent class
    especially if the methods are going to be overridden.*/
    abstract void speak();
     abstract void sleep();
    abstract void eat();

    //abstract classes can also have fully implemented methods.
    //However, creating objects of the class will still not be allowed.
    public void print(){
        System.out.println(name+" "+breed+" "+color);
    }
}

/*Note: In case the subclasses have not implemented all the methods,
then the abstract keyword must be used on the subclasses,
otherwise all the methods must be implemented under the subclasses.*/
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Dog barks");
    }
    @Override
    void sleep(){
        System.out.println("Dog barks");
    }
    @Override
    void eat(){
        System.out.println("Dog eats bones");
    }
}
class Cat extends Animal{
    @Override

    void speak(){
        System.out.println("Cat myawu......");
    }
    @Override
    void sleep(){
        System.out.println("Cat sleeps once a day");
    }
    @Override
    void eat(){
        System.out.println("Cat eats rice");
    }
}
