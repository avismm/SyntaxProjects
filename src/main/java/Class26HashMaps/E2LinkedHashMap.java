package Class26HashMaps;

import java.util.LinkedHashMap;

public class E2LinkedHashMap {
    public static void main(String[] args) {

//With LinkedHashMap, the order of elements will be maintained because the elements are linked.
//Note: Any class can be used as a key or value

        LinkedHashMap<Integer,String> students=new LinkedHashMap<>();
        students.put(1, "Avis");
        students.put(1, "Antifa");
        students.put(3, "Adams");
        students.put(4, "Ken");
        students.put(5, "Shiva");
        System.out.println(students);
        students.remove(4);
        System.out.println(students.containsKey(7));
        students.replace(1,"Antifa","Tina");
        System.out.println(students);

    }
}
