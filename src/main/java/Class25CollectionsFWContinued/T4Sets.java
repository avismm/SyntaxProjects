package Class25CollectionsFWContinued;

import java.util.*;

public class T4Sets {
    public static void main(String[] args) {
        List<String> countries =new ArrayList<>();

        countries.add("Angola");
        countries.add("Japan");
        countries.add("USA");
        countries.add("Russia");
        countries.add("France");
        countries.add("Italy");
        countries.add("Brazil");
        countries.add("Uganda");
        countries.add("Bahamas");
        countries.add("UAE");


        //Converting the elements into a TreeSet which arranges them in alphabetical order
        TreeSet<String> set1=new TreeSet<>(countries);

        //Printing the elements
        set1.forEach(x-> System.out.print(x+", "));
        System.out.println();
       set1.stream().sorted();
        set1.forEach(x-> System.out.print(x+", "));
    }
}
