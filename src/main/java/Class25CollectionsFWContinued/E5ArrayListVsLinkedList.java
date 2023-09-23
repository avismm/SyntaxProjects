package Class25CollectionsFWContinued;

import java.util.LinkedList;

public class E5ArrayListVsLinkedList {
    public static void main(String[] args) {

        LinkedList<Dog> dogs = new LinkedList<>();
        dogs.add(new Dog("Avis", "Jeremy"));

        //getting the object stored on index 2 and storing it inside the d variable
        Dog d = dogs.get(2);
        d.printInfo();

    }
}
     class Dog{
        String name;
        String breed;

        public Dog(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }
        void printInfo(){
            System.out.println(name+", "+breed);
        }
    }

