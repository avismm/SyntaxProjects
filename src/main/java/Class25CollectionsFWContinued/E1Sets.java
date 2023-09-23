package Class25CollectionsFWContinued;

import java.util.ArrayList;
import java.util.HashSet;

public class E1Sets {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList();
        numbers.add(56);
        numbers.add(43);
        numbers.add(67);
        numbers.add(21);

        //HashSets do not allow duplicate data structures
        //With HashSets, there is no guarantee on the insertion order of the elements
        //The data structure behind the HashSet is called a hash
        //We can store duplicates in an ArrayList or LinkedLists

        HashSet<Integer> uniqNumbers=new HashSet<>();
        uniqNumbers.add(43);
        uniqNumbers.add(23);
        uniqNumbers.add(10);
        uniqNumbers.add(18);
        uniqNumbers.add(23);
        uniqNumbers.add(25);
        System.out.println(uniqNumbers);
    }








}
