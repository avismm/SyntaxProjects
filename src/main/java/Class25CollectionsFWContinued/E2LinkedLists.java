package Class25CollectionsFWContinued;

import java.util.LinkedList;

public class E2LinkedLists {
    public static void main(String[] args) {

        //The behind the scenes data structure for LinkedLists is a linear data structure
        //It has addresses and pointers that are used to link the elements and each element
        // in the linked list consists of two parts, namely, the data part and the address part.
        LinkedList<Integer>  numbers= new LinkedList<>();
        numbers.add(54);
        numbers.add(43);
        numbers.add(77);
        numbers.add(90);
        numbers.add(12);
        numbers.add(34);
        numbers.remove(2);
        System.out.println(numbers);
        numbers.removeIf(x->x<40);
        numbers.removeIf(x->x%2==0);
        System.out.println(numbers);
    }
}
