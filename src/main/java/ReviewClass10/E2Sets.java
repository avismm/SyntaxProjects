package ReviewClass10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class E2Sets {
    public static void main(String[] args) {
        //Sets commonly used to remove duplicates
        //But in practice, another set will be created to insert the elements back.
        Set<Integer> numbers=new HashSet<>();//HashSet implements the Set interface.
        numbers.add(20);
        numbers.add(10);
        numbers.add(50);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);

        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(20);
        nums.add(20);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(40);
        nums.add(10);

        LinkedHashSet<Integer> cleanedNumbs=new LinkedHashSet<>(nums);
        System.out.println(cleanedNumbs);

        //We can then create an object of the arrayList class and store the new cleaned numbers there.
        nums=new ArrayList<>(cleanedNumbs);
        System.out.println(nums);

        //You can also clear the original list and then add the new cleaned elements
        nums.clear();
        nums.addAll((cleanedNumbs));

    }

}
