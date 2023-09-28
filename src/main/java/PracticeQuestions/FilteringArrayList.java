package PracticeQuestions;

import java.util.ArrayList;
import java.util.List;

public class FilteringArrayList{

        public static void main(String[] args) {

            List<String> countries = new ArrayList<>();
            countries.add("Armenia");
            countries.add("USA");
            countries.add("Kazakhstan");
            countries.add("Australia");
            countries.add("Pakistan");
            countries.add("Russia");
            countries.add("Azerbaijan");

            List<String> listWithoutA= methodRemoveElements(countries);

            System.out.println(listWithoutA);
        }

        public static List<String> methodRemoveElements(List<String> countries){
            List<String> listWithoutA = new ArrayList<>();
            for(String element:countries){
                if(!element.startsWith("A")){
                    listWithoutA.add(element);
                }
            }
            return listWithoutA;

        }
}
