package Class26HashMaps;

import java.util.LinkedHashMap;

public class T1HashMaps {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> building=new LinkedHashMap<>();
        building.put(1,"Kenfreight");
        building.put(2,"IBM");
        building.put(3,"Tesla");
        building.put(4,"Oracle");
        building.put(5,"Tesla");
        building.put(5,"Euro-foam");
        building.put(6,"Facebook");
        building.put(7,"Microsoft");

        System.out.println(building);
        System.out.println(building.size());
        building.replace(4,"VietBank");
        building.remove(7);
        System.out.println("Updated building: "+building);

        //printing the values from the building map
        building.forEach((k,v)-> System.out.print(k+ ": "+v));
    }
}
