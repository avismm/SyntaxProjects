package PracticeQuestions;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethodReusability {
    public static void main(String[] args) {
        // Create a HashMap of String keys and Integer values
        Map<String, Integer> map = new HashMap<>();

        // Add values to the map
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);

        // Call the display method with the populated map
        display(map);

        // Clear the map
        map.clear();

        // Call the display method again with the cleared map
        display(map);
    }

    public static void display(Map<String, Integer> map) {
        // Check if the map is empty
        if (map.isEmpty()) {
            System.out.println("map is empty");
        } else {
            // Iterate over the map and print key-value pairs
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}

