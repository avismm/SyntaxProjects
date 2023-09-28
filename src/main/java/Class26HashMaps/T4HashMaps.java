package Class26HashMaps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class T4HashMaps {
    public static void main(String[] args) {
        TreeMap<String, String> items=new TreeMap<>();
        items.put("IDD999","Sugar");
        items.put("IDD999","Carrots");
        items.put("IDD999","Bread");
        items.put("IDD999","Source pan");
        items.put("IDD999","Plate");

        //Using nesting, we are declaring a set of entries/objects from the Map interface, and
        // storing those entries (containing key value pairs of data type String, String), into a variable entries.
        Set<Map.Entry<String, String>> entries=items.entrySet();
        for(Map.Entry<String,String> e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
