package Class24CollectionsFramework;

import java.util.ArrayList;

public class T4ArrayListLambdaExpressions {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("milk");
        drinks.add("banana");
        drinks.add("coffee");
        drinks.add("table");
        drinks.add("TV");
        System.out.println(drinks);
        System.out.println("======================================");

        //for every element x from the array list, check the condition for x
        /*drinks.removeIf((String x)->{
            if(x.endsWith("e")){
                return true;
            }else{
                return false;
            }
        });*/

/*In this example, we have a list of drinks, and we use the removeIf
method with a lambda expression (x -> x.endsWith("e")) to remove any
elements (drink names) that end with the letter "e." After executing this code,
the list will only contain the drinks that do not end with "e," and we print the updated list to the console.*/
        drinks.removeIf(X->X.endsWith("e"));
        System.out.println(drinks);

    }
}
