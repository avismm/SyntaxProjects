package Class25CollectionsFWContinued;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class E9Sets {
    public static void main(String[] args) {
        ArrayList<Integer> numbers =new ArrayList<>();

        numbers.add(34);
        numbers.add(67);
        numbers.add(90);
        numbers.add(90);
        numbers.add(32);
        numbers.add(10);

        HashSet<Integer> set1=new HashSet<>(numbers);
        LinkedHashSet<Integer> set2=new LinkedHashSet<>(numbers);
        TreeSet<Integer> set3=new TreeSet<>(numbers);
        numbers.clear();
        System.out.println(numbers);
        System.out.println(set2);
        numbers.addAll(set2);
        System.out.println(numbers);

        set1.forEach(x-> System.out.print(x+" "));
        System.out.println();
        for(Integer n:set2){
            System.out.print(n+" ");
        }
        System.out.println();
        for(Integer n:set3){
            System.out.print(n+" ");
        }
    }
}
