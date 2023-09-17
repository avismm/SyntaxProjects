package Class24CollectionsFramework;

import java.util.ArrayList;

public class E4ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList();
        numbers.add(10);
        numbers.add(60);
        numbers.add(30);
        numbers.add(33);
        numbers.add(10);
        System.out.println(numbers);

        int sum=0;
        int i=0;
        /*while(i<numbers.size()){
            if(numbers.get(i)>20) {
                sum+=numbers.get(i);
            }
            i++;
        }*/
        System.out.println(sum);
        for(int n:numbers){
            if(numbers.get(i)>20){
                sum+=n;
            }

        }

    }
}
