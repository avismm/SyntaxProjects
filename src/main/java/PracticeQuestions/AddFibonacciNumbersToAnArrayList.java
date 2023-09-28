package PracticeQuestions;

import java.util.LinkedList;

public class AddFibonacciNumbersToAnArrayList {
    public static void main(String[] args) {
        LinkedList<Integer> arr=new LinkedList<>();
        int  fibonacciNumber1=0;
        int fibonacciNumber2=1;

        for (int i = 1; i < 11; i++) {

            arr.add(fibonacciNumber1);

           /* the next number in a fibonacci series is the sum of the previous two numbers
            in the series*/
            int nextNumber = fibonacciNumber1 + fibonacciNumber2;

           /* Updating the values inside variables fibonacciNumber1 and fibonacciNumber2
            which will be used to compute the next number of the series in the proceeding
             iteration of the for loop*/
            fibonacciNumber1 = fibonacciNumber2;
            fibonacciNumber2 = nextNumber;

        }
        for(int n:arr) {
            System.out.print(n+" ");
        }



    }
}
