package Class25CollectionsFWContinued;

import java.util.LinkedList;

public class T2ArrayListVsLinkedList {
    public static void main(String[] args) {

        LinkedList<Cat> cats = new LinkedList<>();
        cats.add(new Cat("angel", "german", "white"));
        cats.add(new Cat("Geoffrey", "UK", "black"));
        cats.add(new Cat("Avis", "Uganda", "black"));

        for(Cat cat:cats){
            cat.printInfo();
        }
        cats.forEach(x-> x.printInfo());

    }
}
    class Cat{
        private String name;
       private String breed;
       private String color;

        public Cat(String name, String breed, String color) {
            this.name = name;
            this.breed = breed;
            this.color = color;
        }
        void printInfo(){
            System.out.println(name+" "+breed+" "+color);
        }

}
