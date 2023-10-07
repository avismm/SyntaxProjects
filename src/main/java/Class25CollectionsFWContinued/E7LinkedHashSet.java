package Class25CollectionsFWContinued;

import java.util.LinkedHashSet;

public class E7LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> uniqueNumbers =new LinkedHashSet<>();

        // No duplicates with the class LinkedHashSet
        // is less fast in terms of processing as it has to remember the element order of the set. i.e, order of indexes is maintained
        //There is no get method based on the index. You have to go through the elements one by one.

        uniqueNumbers.add(34);
        uniqueNumbers.add(67);
        uniqueNumbers.add(90);
        uniqueNumbers.add(90);
        uniqueNumbers.add(32);
        uniqueNumbers.add(10);
        uniqueNumbers.forEach(x-> System.out.print(x+" "));
        System.out.println();
        for(Integer n:uniqueNumbers){
            System.out.println(n);
        }
    }
}
