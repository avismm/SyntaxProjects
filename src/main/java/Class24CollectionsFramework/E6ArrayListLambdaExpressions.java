package Class24CollectionsFramework;

import java.util.ArrayList;

public class E6ArrayListLambdaExpressions {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("milk");
        drinks.add("banana");
        drinks.add("coffee");
        drinks.add("table");
        drinks.add("TV");
        System.out.println(drinks);
        System.out.println("======================================");


        //With lambda, it is an entity to which we pass the logic

        for(String X:drinks){
            System.out.println(X);
        }
        //equivalent lambda expression for the above for loop
        drinks.forEach(X-> System.out.println(X));


        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("e")){
                drinks.remove(i);
            }
        }

        //equivalent lambda expression for the for loop
        drinks.removeIf(X->X.contains("e"));
    }
}
