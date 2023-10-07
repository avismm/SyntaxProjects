package PracticeQuestions;

import java.util.HashMap;
import java.util.Map.Entry;

public class UsingEntrySetAndHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("Street", "Patrick ST");
        map.put("Suite", "265");
        map.put("City", "Vienna");
        map.put("Zip", "22180");
        map.put("Country", "United State");

        for (Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String upperCaseValue = value.toUpperCase();
            System.out.println(upperCaseValue);
        }

    }
}
