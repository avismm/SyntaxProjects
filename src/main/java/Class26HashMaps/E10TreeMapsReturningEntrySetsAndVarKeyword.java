package Class26HashMaps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E10TreeMapsReturningEntrySetsAndVarKeyword {
    public static void main(String[] args) {

//With TreeMap, the elements will be sorted

        TreeMap<String,Double> makeUp=new TreeMap<>();
        makeUp.put("Lipsticks", 20.1);
        makeUp.put("Lipsticks", 15.2);
        makeUp.put("BlushOn", 5.0);
        makeUp.put("Base", 3.0);
        makeUp.put("Eyeliner", 2.4);
        makeUp.put("Concealer", 9.1);

        //Using nesting, we are declaring a set of entries/objects from the Map interface, and
        // storing those entries (containing key value pairs of data type String, String), into a variable entries.
        Set<Map .Entry<String,Double>> entries=makeUp.entrySet();
        for(Map.Entry<String,Double> e:entries){
            System.out.println(e.getKey()+": "+e.getValue());
        }

        System.out.println();
        //we can also use the var keyword to return the entries straightaway
        var entry=makeUp.entrySet();
        for(var e:entry){
            System.out.println(e.getKey()+": "+e.getValue());
        }

    }
}
