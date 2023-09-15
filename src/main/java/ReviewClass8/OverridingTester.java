package ReviewClass8;

public class OverridingTester {
    public static void main(String[] args) {
        new Dog().speak();
        new Overriding().speak();

        //We can also use parent classes as data types and perform type casting.
       Overriding a=new Dog();
       a.speak();// the speak method in the Dog class will be called.
    }

}
