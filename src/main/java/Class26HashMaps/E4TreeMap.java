package Class26HashMaps;

import java.util.TreeMap;

public class E4TreeMap {
    public static void main(String[] args) {

//With TreeMap, the elements will be sorted

        TreeMap<String,Double> makeUp=new TreeMap<>();
        makeUp.put("Lipsticks", 20.1);
        makeUp.put("Lipsticks", 15.2);
        makeUp.put("BlushOn", 5.0);
        makeUp.put("Base", 3.0);
        makeUp.put("Eyeliner", 2.4);
        makeUp.put("Concealer", 9.1);

        //Using lambda expression
        /*makeUp.forEach((k,v)->System.out.println(k+"= "+k));
        makeUp.forEach((k,v)->System.out.println(v));
        makeUp.forEach((k,v)->System.out.println(k));*/

        /*Using other conditions with lambda. Whenever we need more than one parameter, we
        should use parenthesis. Similarly, if we want to have more than one line of code,
        we need a carry bracket*/
        makeUp.forEach((k,v)->{
            if(k.contains("a")) {
                System.out.println(v);
            }
        });


    }
}
