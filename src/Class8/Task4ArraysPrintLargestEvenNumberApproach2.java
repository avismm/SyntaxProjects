package Class8;

public class Task4ArraysPrintLargestEvenNumberApproach2 {
   /* A program to count the number of false elements
    in an array.*/
    public static void main(String[] args) {
        int[] nums = {10, 77, 25, 56,45,20};
        int largestEven=nums[0];
      /*  It was important the largestEven variable
        be initialized with the value at element zero*/
               for(int n:nums){
                if(n%2==0&&n>largestEven){
                     largestEven=n;
                     System.out.print(largestEven + " ");
            }
        }
    }
}
