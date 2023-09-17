package Class24CollectionsFramework;

import java.util.ArrayList;

public class T2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Benz");
        cars.add("Tesla");
        cars.add("Toyota");
        cars.add("Nissan");
        System.out.println(cars);
        System.out.println("===============================");

        for(String car: cars){
            System.out.println(car);
        }
        System.out.println("==================================");
        int i=0;
        while(i<cars.size()){
            System.out.println(cars.get(i));
            i++;
        }
    }
}
