package Class8EnhancedForLoopBreakContinue;

public class Task4ArraysPrintLargestEvenNumber {
   /* A program to count the number of false elements
    in an array.*/
    public static void main(String[] args) {
        int[] nums = {10, 77, 25, 56,45,20};
        int largestEven=nums[0];
               for(int n:nums){
                if(n%2==0){
                    if(n>largestEven) {
                        largestEven=n;
                        System.out.print(largestEven + " ");
                    }
            }
        }
    }
}
