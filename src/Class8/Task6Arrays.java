package Class8;

public class Task6Arrays {
   /* Search the array for number 45. If it is present in the
   * array, print found*/
    public static void main(String[] args) {
        int[] nums = {10, 77, 25, 56,60,20,45,-5};
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==45){
                System.out.println("number "+nums[i]+" has been found");
            }
        }

    }
}
