package Review10;

import java.util.ArrayList;

public class E5ArrayListAddingFromListToList {
    public static void main(String[] args) {

        ArrayList<String> fruits= new ArrayList<>();
        fruits.add("Apple");
        fruits.add("pineaple");
        fruits.add("Orange");
        fruits.add("Jark fruit");
        fruits.add("pawpaw");
        fruits.add("Gava");
        fruits.add("Cherry");

        //We want to add the fruits into the vegetables list
        ArrayList<String> vegetables= new ArrayList<>();
        fruits.add("Potatoe");
        fruits.add("carrot");
        fruits.add("Cucumber");
        vegetables.addAll(fruits);//adding fruits to the vegetables list
        System.out.println(vegetables);
        vegetables.removeAll(fruits);
        System.out.println(vegetables);




    }

}
