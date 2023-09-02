package Class8;

public class Task5Arrays {
   /* A program to print the smallest number
   from an array.*/
    public static void main(String[] args) {
        int[] nums = {10, 77, 25, 56,60,20,-10,-5};
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<0){
                nums[i]=0;
            }
            System.out.println(nums[i]);

        }

    }
}
