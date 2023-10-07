package Review10;

import java.util.ArrayList;

public class E6ArrayListWithLambda {
    public static void main(String[] args) {

        ArrayList<String> fruits= new ArrayList<>();
        fruits.add("Apple");
        fruits.add("pineaple");
        fruits.add("Orange");
        fruits.add("Jark fruit");
        fruits.add("pawpaw");
        fruits.add("Gava");
        fruits.add("Cherry");

        fruits.replaceAll(x->{
            if(x.contains("a")){
                return "water";
            }else {
                return x;
            }
        });

        System.out.println(fruits);




    }

}
