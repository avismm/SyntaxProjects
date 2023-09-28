package Class26HashMaps;

import java.util.Collection;
import java.util.TreeMap;

public class E3TreeMap {
    public static void main(String[] args) {

//With TreeMap, the elements will be sorted

        TreeMap<String,Double> makeUp=new TreeMap<>();
        makeUp.put("Lipsticks", 20.1);
        makeUp.put("Lipsticks", 15.2);
        makeUp.put("BlushOn", 5.0);
        makeUp.put("Base", 3.0);
        makeUp.put("Eyeliner", 2.4);
        makeUp.put("Concealer", 9.1);
        System.out.println(makeUp);
        //System.out.println(makeUp.keySet());
        Collection<String> keys=makeUp.keySet();
        System.out.println(keys);
        Collection<Double> values=makeUp.values();
        System.out.println(values);
    }
}
