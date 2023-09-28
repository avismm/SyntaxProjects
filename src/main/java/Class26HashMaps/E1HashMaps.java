package Class26HashMaps;

import java.util.HashMap;

public class E1HashMaps {
    public static void main(String[] args) {

//Note: A duplicate key value pair will be overriden by the next reoccurring key value pair.
        //e.g., in the example below, Bananas with a value of 3 was replaced with Bananas with
        //a value of 4

        HashMap<String, Double> fruits=new HashMap<>();
        fruits.put("Mango", 6.0);
        fruits.put("Orange", 7.0);
        fruits.put("Pineapple", 2.0);
        fruits.put("Passion fruit", 5.0);
        fruits.put("Bananas", 3.0);
        fruits.put("Bananas", 4.0);
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.containsKey("Apple"));
        System.out.println(fruits.containsValue(3.0));
        System.out.println(fruits.isEmpty());
    }
}
