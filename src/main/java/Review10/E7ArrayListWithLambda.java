package Review10;

import java.util.LinkedList;

public class E7ArrayListWithLambda {
    public static void main(String[] args) {

        LinkedList<String> fruits= new LinkedList<>();
        fruits.add("Apple");
        fruits.add("pineaple");
        fruits.add("Orange");
        fruits.add("Jark fruit");
        fruits.add("pawpaw");
        fruits.add("Gava");
        fruits.add("Cherry");

        //streamAPI has been developed to simplify the use of lambda
        fruits.stream().forEach(x-> System.out.println(x));

    }

}
