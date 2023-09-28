package Class23Encapsulation;

import java.util.ArrayList;

public class E5ArrayLists {
    public static void main(String[] args) {

        //Creating an object from the ArrayList class
        ArrayList names=new ArrayList();
        names.add("Alex");
        names.add("Avis");
        names.add("sugar");
        names.add("animals");
        System.out.println(names);
        System.out.println(names.size());
        names.remove(2);
        System.out.println(names.size());
        System.out.println(names);
    }
}
