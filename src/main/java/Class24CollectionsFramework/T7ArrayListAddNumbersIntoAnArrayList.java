package Class24CollectionsFramework;

import java.util.ArrayList;

public class T7ArrayListAddNumbersIntoAnArrayList {

    /*create an array list of fruits. Remove all the fruits which contains the letter a or ends with letter e*/
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Vanilla");
        fruits.add("lemon");
        fruits.add("Onion");
        fruits.add("pineapple");
        fruits.add("Orange");

        System.out.println(fruits);
        System.out.println("===============================");
/*
       for (int i = fruits.size()-1;i>0; i--) {
           if(fruits.get(i).endsWith("e")||fruits.get(i).contains("a")){
               fruits.remove(i);
           }
        }
        System.out.println(fruits);*/


        //Equivalent lambda expression that replaces the for loop
            fruits.removeIf(X->X.contains("a")||X.endsWith("e"));
        System.out.println(fruits);


        }
    }
