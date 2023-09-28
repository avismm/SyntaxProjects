package Class26HashMaps;

import java.util.TreeMap;

public class E11TreeMapsConvertingToEntrySetAndRemoveIf {
    public static void main(String[] args) {

//With TreeMap, the elements will be sorted

        TreeMap<String,Double> makeUp=new TreeMap<>();
        makeUp.put("Lipsticks", 20.1);
        makeUp.put("Lipsticks", 15.2);
        makeUp.put("BlushOn", 5.0);
        makeUp.put("Base", 3.0);
        makeUp.put("Eyeliner", 2.4);
        makeUp.put("Concealer", 14.1);

        //Map does not contain the removeIf method. entrySet from the Set collection contains the removeIf method.
        makeUp.entrySet().removeIf(x->x.getKey().contains("a"));
        makeUp.entrySet().removeIf(x->x.getValue()>12);
        makeUp.entrySet().removeIf(x->x.getKey().contains("a")&&x.getValue()>10);
        System.out.println(makeUp);

    }
}
