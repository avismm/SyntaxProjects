package Class24CollectionsFramework;

import java.util.ArrayList;

public class T1ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("Alex");
        names.add("Avis");
        names.add("Julia");
        names.add("Sean");
        names.add("Tina");
        System.out.println(names);
        System.out.println("=========================================");
        System.out.println("Is the array empty? "+names.isEmpty());
        System.out.println("Is the array containing the name Alex? "+names.contains("Alex"));
        System.out.println("What is the array size? "+names.size());
    }
}
