package Class24CollectionsFramework;

import java.util.ArrayList;

public class T5ArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("water");
        drinks.add("juice");
        drinks.add("rock boom");
        drinks.add("coca cola");
        System.out.println(drinks);
        System.out.println("======================================");

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).endsWith("e")){
                drinks.remove(i);
            }
        }
        System.out.println(drinks);
    }
}
