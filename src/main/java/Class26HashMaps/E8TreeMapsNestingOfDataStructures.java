package Class26HashMaps;

import java.util.ArrayList;
import java.util.LinkedList;

public class E8TreeMapsNestingOfDataStructures {
    public static void main(String[] args) {

        //In this scenario, we will require an ArrayList of type Integer
        LinkedList<ArrayList<Integer>> test=new LinkedList<>();
        ArrayList<String> names=new ArrayList<>();
        //test.add(names); error because the type of ArrayList is different

        LinkedList<Integer>  nums=new LinkedList<>();
        //test.add(nums); error because the data structure (Class) is different

        ArrayList<Integer>  numbers=new ArrayList<>();
        test.add(numbers); //this works because the class and data type are the same

    }
}
