package Class8;

public class Task4ArraysPrintSmallesNumberFromArray {
   /* A program to print the smallest number
   from an array.*/
    public static void main(String[] args) {
        int[] nums = {10, 77, 25, 56,-45,20};
        int smallestNumber=nums[0];
               for(int n:nums){
                if(n<smallestNumber) {
                        smallestNumber=n;
                        System.out.print(smallestNumber + " ");
                    }

        }
    }
}
