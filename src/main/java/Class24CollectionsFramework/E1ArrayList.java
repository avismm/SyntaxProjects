package Class24CollectionsFramework;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Shakila");
        names.add("Sugar");
        names.add("Shiela");
        names.add("Daniel");
        names.add("Kanabis");
        names.add(0,"Avis");
        System.out.println(names);
        names.set(1,"James");
        System.out.println(names);
    }
}
