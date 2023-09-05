package Class16;

public class PersonObjectMultipleConstructors {
    public static void main(String[] args) {
        PersonMultipleConstructors p1=new PersonMultipleConstructors("Avis", 45,45.99,'M');
        p1.printInfo();

        PersonMultipleConstructors p2=new PersonMultipleConstructors("Avis", 45,45.99,'M',"blue", 45.89 );
        p2.printInfo();

    }

}
