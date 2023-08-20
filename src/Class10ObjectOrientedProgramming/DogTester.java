package Class10ObjectOrientedProgramming;

public class DogTester {
    public static void main(String[] args) {
        //were creating a actual dog instance/object by using the Dog class
        // and assigning values or attributes to the object lunasObj.
        Dog lunasObj=new Dog();

        lunasObj.name="Habib";
        lunasObj.breed= "german";
        lunasObj.gender= 'F';
        lunasObj.weight=34.87;
        System.out.println(lunasObj.breed);
        System.out.println(lunasObj.name);
        System.out.println(lunasObj.gender);

        //Here we are calling the methods (eat,bark and sleep) on the lunasObj
        lunasObj.eat();
        lunasObj.bark();
        lunasObj.sleep();

    }
}
