package Class24CollectionsFramework;

import java.util.ArrayList;

public class T6ArrayListAddNumbersIntoAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Populate the ArrayList with even numbers from 1 to 500
        for (int i = 2; i <= 500; i += 2) {
            numbers.add(i);
        }
        System.out.println(numbers);
        System.out.println("===============================");

       /* for (int i = numbers.size()-1;i>0; i--) {
            if(numbers.get(i)%5==0){
                numbers.remove(i);
            }
        }
        System.out.println(numbers);*/

        //Equivalent lambda expression
            numbers.removeIf(X->X%5==0);
        System.out.println(numbers);


        }
    }
