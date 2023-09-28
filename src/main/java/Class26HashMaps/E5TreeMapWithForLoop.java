package Class26HashMaps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E5TreeMapWithForLoop {
    public static void main(String[] args) {

//With TreeMap, the elements will be sorted

        TreeMap<String,Double> makeUp=new TreeMap<>();
        makeUp.put("Lipsticks", 20.1);
        makeUp.put("Lipsticks", 15.2);
        makeUp.put("BlushOn", 5.0);
        makeUp.put("Base", 3.0);
        makeUp.put("Eyeliner", 2.4);
        makeUp.put("Concealer", 9.1);

        //Set<Map.Entry<String, Double>> entries declares a variable named entries of type Set<Map.Entry<String, Double>>.
        // This variable is used to store the set of entries from the makeUp map.
       Set<Map.Entry<String, Double>> entries =makeUp.entrySet();
       for(Map.Entry<String, Double> e:entries){
           System.out.println(e.getKey()+" "+e.getValue());
       }

    }
}
