package Class25CollectionsFWContinued;

import java.util.*;

public class T3Sets {
    public static void main(String[] args) {
        List<String> aList =new ArrayList<>();

        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        HashSet<String> set1=new HashSet<>(aList);
        LinkedHashSet<String> set2=new LinkedHashSet<>(aList);
        TreeSet<String> set3=new TreeSet<>(aList);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        /*System.out.println();
        set1.forEach(x-> System.out.println(x+" "));
        set2.forEach(x-> System.out.println(x+" "));
        set3.forEach(x-> System.out.println(x+" "));*/

     /*
        for(Integer n:set2){
            System.out.print(n+" ");
        }
        System.out.println();
        for(Integer n:set3){
            System.out.print(n+" ");
        }*/
    }
}
