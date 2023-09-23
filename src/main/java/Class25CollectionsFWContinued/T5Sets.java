package Class25CollectionsFWContinued;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class T5Sets {
    public static void main(String[] args) {
        List<String> cities =new ArrayList<>();

        cities.add("Tokyo");
        cities.add("Ho Chi");
        cities.add("NeYork");
        cities.add("Frankfurt");
        cities.add("Nairobi");
        cities.add("Johannesburg");
        cities.add("Adams");

        //System.out.println(cities);
        //Converting the elements into a TreeSet which arranges them in alphabetical order
        LinkedHashSet<String> set1=new LinkedHashSet<>(cities);

        //Printing the elements that do not start with letter "A"
        for(String c:set1) {
            if(!c.toLowerCase().startsWith("a")){
                System.out.print(c+": ");
            }
        }
        System.out.println();
        //using lambda
        set1.removeIf(x ->x.toLowerCase().startsWith("a") );
        System.out.println(set1);
    }
}
