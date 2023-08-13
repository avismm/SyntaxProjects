package Class7;

public class Task6ArrayLargestNumber {
    //From an array of integer elements find the largest number.
    public static void main(String[] args) {
        int [] numbers={1,3,10,5,6,7,8};
        int largest=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
                if(numbers[i]>largest){
                largest=numbers[i];
        }
        }
        System.out.print(largest);
    }
}
