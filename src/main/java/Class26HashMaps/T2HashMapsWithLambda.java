package Class26HashMaps;

import java.util.TreeMap;

/*Create a map of countries(5) with its capital that will store countries in alphabetical order. Country names will be keys and capitals will be values
        Print all keys and values from a country map using for each loop or Lambda.
        Print all values from a country map using for each loop or Lambda. Print countries that have more
        than 5 letters in their country name*/
public class T2HashMapsWithLambda {
    public static void main(String[] args) {
        TreeMap<String, String> countries=new TreeMap<>();
        countries.put("USA","DC");
        countries.put("Uganda","Kampala");
        countries.put("UK","London");
        countries.put("Russia","Moscow");
        countries.put("Germany","Frankfurt");
        countries.put("France","Paris");
        countries.put("SouthAfrica","Johannesburg");

        //Printing country names that are greater than 5 characters
        countries.forEach((k,v)-> {
            if(k.length()>5&&v.contains("k")) {
                System.out.println(k+" => "+v);
            }
        });

    }
}
