package Class25CollectionsFWContinued;

import java.util.TreeSet;

public class E8TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> uniqueNumbers =new TreeSet<>();

        // No duplicates with the class TreeSet
        // TreeSet will sort the data elements in the set
        // is less fast in terms of processing as it has to sort the data. It is the slowest way to process data compared
        //to LinkedHashSet and HashSet
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
