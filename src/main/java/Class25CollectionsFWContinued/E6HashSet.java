package Class25CollectionsFWContinued;

import java.util.HashSet;

public class E6HashSet {
    public static void main(String[] args) {
        HashSet<String> fruit =new HashSet<>();

        // No dupicates and no insertion order with the class HashSet
        //There is no get method based on the index. You have to go through the elements one by one.
        //Sets are best used when you want to remove duplicates
        fruit.add("Lemon");
        fruit.add("Orange");
        fruit.add("Rock boom");
        fruit.add("Banana");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Kiwi");
        fruit.add("Bushbaby");
        fruit.add("Rock boom");
        System.out.println(fruit);
        fruit.forEach(x-> System.out.println(x));
        System.out.println();
        for(String f:fruit){
            System.out.println(f);
        }
    }
}
