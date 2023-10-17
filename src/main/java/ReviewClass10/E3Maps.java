package ReviewClass10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class E3Maps {
    public static void main(String[] args) {
        Map<String, Double> studentMarks1=new HashMap<>();
        studentMarks1.put("Avis",67.0);
        studentMarks1.put("Nelson",67.0);
        studentMarks1.put("Julia",67.0);
        studentMarks1.put("Kennedy",67.0);
        studentMarks1.put("Sula",67.0);
        System.out.println(studentMarks1);

        LinkedHashMap<String, Double> studentMarks2 =new LinkedHashMap<>();
        studentMarks2.put("Avis",67.0);
        studentMarks2.put("Nelson",67.0);
        studentMarks2.put("Julia",67.0);
        studentMarks2.put("Kennedy",67.0);
        studentMarks2.put("Sula",67.0);
        System.out.println(studentMarks2);

        TreeMap<String, Double> studentMarks3 =new TreeMap<>();
        studentMarks3.put("Avis",67.0);
        studentMarks3.put("Nelson",67.0);
        studentMarks3.put("Julia",67.0);
        studentMarks3.put("Kennedy",67.0);
        studentMarks3.put("Sula",67.0);
        System.out.println(studentMarks3);


    }
}
