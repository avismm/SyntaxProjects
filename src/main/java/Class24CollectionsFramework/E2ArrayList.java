package Class24CollectionsFramework;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Shakila");
        names.add("Sugar");
        names.add("Shiela");
        names.add("Daniel");
        names.add("Cannabis");
        names.add(0,"Avis");
        System.out.println(names);
        names.set(1,"James");
        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        for(String c:names){
            System.out.println(c+" " );

        }
        System.out.println("========================================");
        int i=0;
        while(i<names.size()){
            System.out.println(names.get(i));
            i++;
        }
    }
}
