package Class13VariableTypes;

public class E3DogTester {
    public static void main(String[] args) {

        E3Dog d1= new E3Dog();
        d1.name="Avis";
        d1.breed="German shepard";
        d1.age=45;

        E3Dog d2= new E3Dog();
        d2.name="Anna";
        d2.breed="German";
        d2.age=23;

        d1.printInfor();
        d2.printInfor();

    }

}
