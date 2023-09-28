package PracticeQuestions;

import java.util.LinkedList;

public class ArrayListRemovePrimeNumberFromList {
    public static void main(String[] args){

        LinkedList<Integer> list=new LinkedList<>();
        ArrayListRemovePrimeNumberFromList obj=new ArrayListRemovePrimeNumberFromList();

        for(int i=2; i<=100;i++)
        {
            list.add(obj.checkPrime(i));
            list.removeIf(x -> x == 0);
        }

        System.out.println(list);
    }
    int checkPrime(int num) {
        boolean prime = true;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            return num; // Return the number if it's prime
        }
        return 0; // Return a sentinel value (e.g., -1) to indicate it's not prime
    }

}
