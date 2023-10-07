package PracticeQuestions;

import java.util.HashMap;
import java.util.Map;

public class HashMap206 {
    public static void main(String[] args) {
        // Create a HashMap of String key-value pairs
        Map<String, String> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        // Print key and values pairs using for each loop
        System.out.println("Key-Value pairs:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Remove specified keys from the map
        map.remove("ONE");
        map.remove("FOUR");
        map.replace("FIVE","FIVE");

        // Print the map after removal
        System.out.println("\nKey-Value pairs after removal:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
