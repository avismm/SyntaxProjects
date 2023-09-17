package Class24CollectionsFramework;

import java.util.ArrayList;

public class T4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("milk");
        drinks.add("banana");
        drinks.add("coffee");
        drinks.add("table");
        drinks.add("TV");
        System.out.println(drinks);
        System.out.println("======================================");

        /*This does not work with the normal for loop because of the shifting of index
        in the ArrayList*/
      /*  for (int i = drinks.size()-1; i >0; i--) {
            if(drinks.get(i).endsWith("e")){
                drinks.remove(i);
            }
        }
        System.out.println(drinks);*/

        //You can use the reverse for loop or you can check the previous element everytime you loop through the list.
        for (int i = 0;i<drinks.size(); i++) {
            if(drinks.get(i).endsWith("e")){
                drinks.remove(i);
                i--;
            }
        }
        System.out.println(drinks);
    }
}
