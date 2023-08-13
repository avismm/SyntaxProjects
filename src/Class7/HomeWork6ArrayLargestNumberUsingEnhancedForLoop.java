package Class7;

public class HomeWork6ArrayLargestNumberUsingEnhancedForLoop {
    //From an array of integer elements find the largest number.
    public static void main(String[] args) {
        int [] numbers={1,3,10,5,6,7,8};
        int largest=numbers[0];
     /*   Best approach is to think of the steps logically
        in form of pseudocode*/

        for (int n:numbers) {// This is read as: For every integer n in an array of numbers.
                if(n>largest){
                largest=n;
        }
        }
        System.out.print(largest);
    }
}
