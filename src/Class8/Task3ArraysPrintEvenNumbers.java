package Class8;

public class Task3ArraysPrintEvenNumbers {
   /* A program to count the number of false elements
    in an array.*/
    public static void main(String[] args) {
        int[] nums = {10, 23, 25, 56,45,20};
               for(int n:nums){
            if(n%2==0){
                System.out.print(n+" ");
            }
        }
    }
}
