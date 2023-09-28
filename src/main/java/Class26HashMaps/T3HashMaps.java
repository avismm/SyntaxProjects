package Class26HashMaps;

import java.util.TreeMap;

public class T3HashMaps {
    public static void main(String[] args) {
        TreeMap<String, String> countries=new TreeMap<>();
        countries.put("USA","DC");
        countries.put("Uganda","Kampala");
        countries.put("UK","London");
        countries.put("Russia","Moscow");
        countries.put("Germany","Frankfurt");
        countries.put("France","Paris");
        countries.put("SouthAfrica","Johnasburg");

        countries.forEach((k,v)-> System.out.println(k));
        countries.forEach((k,v)-> System.out.println(v));
        countries.forEach((k,v)-> System.out.print(k+": "+v));

    }
}
