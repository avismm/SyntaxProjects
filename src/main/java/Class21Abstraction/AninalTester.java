package Class21Abstraction;

public class AninalTester {
    public static void main(String[] args) {
        Animal[] arr={new Cat(), new Dog()};
        for(Animal a:arr){

            //iterating through the elements of an array arr of objects, and calling the methods
            a.speak();
            a.sleep();
            a.eat();
        }
    }
}
