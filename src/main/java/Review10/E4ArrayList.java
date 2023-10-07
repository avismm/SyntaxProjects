package Review10;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruits= new ArrayList<>();
        fruits.add("Apple");
        fruits.add("pineaple");
        fruits.add("Orange");
        fruits.add("Jark fruit");
        fruits.add("pawpaw");
        fruits.add("Gava");
        fruits.add("Cherry");
        fruits.forEach(x-> System.out.println(x));
        fruits.forEach(x->{
            if(x.contains("a")) {
                System.out.println(x);
            }
        });
        fruits.set(2,"Almond");
        System.out.println(fruits);
    }

}
