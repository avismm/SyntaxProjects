package Class23;

import java.util.ArrayList;

public class E7ArrayListsGenerics {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList();
        arr.add("Ace");
        arr.add("Avis");
        arr.add("Gulia");
        System.out.println(arr.get(0));
        System.out.println(arr.contains("TY"));
    }
}
