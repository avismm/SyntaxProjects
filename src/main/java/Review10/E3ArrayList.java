package Review10;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<>();
        names.add("ali");
        names.add("Avis");
        names.add("Julia");
        names.add("James");
        names.add("Ken");
        names.add("Peter");
        names.add("Peter");

        System.out.println(names.size());
        System.out.println(names.get(2));
        System.out.println(names.remove(1));//If you know the index of something, provide it directly so the program can run faster. The memory locations are equally spaced, so java can skip the indexes and move directly to the specified index.
        System.out.println(names.remove("Avis"));//This approach will take longer as java has to search for the string.

        //removing duplicate values
        names.removeIf(x->x.equals("Peter"));
        System.out.println(names);


    }

}
