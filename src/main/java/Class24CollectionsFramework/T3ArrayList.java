package Class24CollectionsFramework;

import java.util.ArrayList;

public class T3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("water");
        drinks.add("juice");
        drinks.add("rock boom");
        drinks.add("coca cola");

        System.out.println(drinks);
        System.out.println("======================================");

        for(String element:drinks){
            if(element.contains("a")||element.contains("e")){
                element="water";
            }
            System.out.println(element);
        }

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a")|| drinks.get(i).contains("e")){
                drinks.set(i,"water");
            }


        }


    }
}
