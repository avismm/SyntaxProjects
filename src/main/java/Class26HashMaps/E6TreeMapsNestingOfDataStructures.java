package Class26HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class E6TreeMapsNestingOfDataStructures {
    public static void main(String[] args) {

        ArrayList<Double> priceOfMakeUp=new ArrayList<>();
        priceOfMakeUp.add(35.3);
        priceOfMakeUp.add(25.3);
        priceOfMakeUp.add(20.3);

        ArrayList<Double> priceOfFruit=new ArrayList<>();
        priceOfFruit.add(5.3);
        priceOfFruit.add(2.3);
        priceOfFruit.add(2.9);

        ArrayList<Double> priceOfDiary=new ArrayList<>();
        priceOfDiary.add(5.3);
        priceOfDiary.add(2.3);
        priceOfDiary.add(2.9);

        /*
        Map<String, ArrayList<Double>> declares a variable named arrayListMap with a type parameterization.
        It's a Map that associates strings (keys) with lists of double values (values).
        The String type is used as the key type, and ArrayList<Double> is used as the value type.
        new HashMap<>() creates a new instance of a HashMap and initializes arrayListMap to this new HashMap.
        This is the implementation of the Map interface that you are using to store the key-value pairs.
        */

        Map<String, ArrayList<Double>> arrayListMap=new HashMap<>();
        arrayListMap.put("priceOfMakeUp",priceOfMakeUp);
        arrayListMap.put("priceOfFruit",priceOfFruit);
        arrayListMap.put("priceOfDiary",priceOfDiary);
        System.out.println(arrayListMap);
    }
}
