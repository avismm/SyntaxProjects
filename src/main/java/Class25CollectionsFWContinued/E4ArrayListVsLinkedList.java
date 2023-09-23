package Class25CollectionsFWContinued;

import java.util.LinkedList;

public class E4ArrayListVsLinkedList {
    public static void main(String[] args) {

    /*   long startTime=System.currentTimeMillis();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            numbers.add(i);
            //numbers.add(0,30);
        }
        for (int i = 0; i < 100; i++) {
            numbers.get(i);

        }
        long endTime=System.currentTimeMillis();
        long timeTaken= endTime-startTime;
        System.out.println(timeTaken);*/

//Using the LinkedList will execute much faster
//we can log the time as below
      long startTime=System.currentTimeMillis();
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            numbers.add(i);
            //numbers.add(0,30);
        }
        for (int i = 0; i < 100; i++) {
            numbers.get(i);

        }
        long endTime=System.currentTimeMillis();
        long timeTaken= endTime-startTime;
        System.out.println(timeTaken);

    }

}
