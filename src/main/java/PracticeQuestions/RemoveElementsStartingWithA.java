package PracticeQuestions;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsStartingWithA {

        public static void main(String[] args) {
            // Create a list of strings
            List<String> stringList = new ArrayList<>();
            stringList.add("Apple");
            stringList.add("Banana");
            stringList.add("Orange");
            stringList.add("Avocado");
            stringList.add("Grapes");

            // Call the method to remove elements starting with "A"
            List<String> updatedList = removeElementsStartingWithA(stringList);

            // Print the updated list
            System.out.println("Updated list:");
            for (String item : updatedList) {
                System.out.println(item);
            }
        }

        public static List<String> removeElementsStartingWithA(List<String> inputList) {
            // Create a new list to store the filtered elements
            List<String> filteredList = new ArrayList<>();

            // Iterate through the input list and add elements that do not start with "A" to the filtered list
            for (String item : inputList) {
                if (!item.startsWith("A")) {
                    filteredList.add(item);
                }
            }

            // Return the filtered list
            return filteredList;
        }
    }
