package Class25CollectionsFWContinued;

import java.util.ArrayList;

public class E1ArrayLists {
    public static void main(String[] args) {
        int[] arr=new int[5];
        ArrayList<Integer> numbers =new ArrayList();
        numbers.add(30);
        numbers.add(54);
        numbers.add(89);
        numbers.add(76);
        numbers.add(32);
        System.out.println(numbers);
        numbers.remove(1);
        numbers.removeIf(x->x>12);
        numbers.forEach(System.out::println);
    }
}
