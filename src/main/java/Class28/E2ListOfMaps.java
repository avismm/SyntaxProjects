package Class28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E2ListOfMaps {
    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        names.add("James");
        System.out.println(names.get(0));

        List<Map<String, String>> mapList=new ArrayList<>();

        //Map that contains key value pairs of type String
        Map<String, String> map1=new HashMap<>();
        map1.put("Name", "Avis");
        map1.put("City", "Ho Chi Minh");
        map1.put("Age", "150");
        map1.put("Salary", "150000");
        mapList.add(map1);

        Map<String, String> map2=new HashMap<>();
        map2.put("Name", "Fahim");
        map2.put("City", "NewYord");
        map2.put("Age", "150");
        map2.put("Salary", "150000");
        mapList.add(map2);

        //Getting the complete Map back from the list
        Map<String, String> firstMap =mapList.get(0);
        System.out.println(firstMap);

        //Getting the value of name key from the Map firstMap
        System.out.println(firstMap.get("Name"));
    }
}
