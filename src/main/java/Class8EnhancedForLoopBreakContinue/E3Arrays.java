package Class8EnhancedForLoopBreakContinue;
//replacing a value at a particular index in an array

public class E3Arrays {

    public static void main(String[] args) {
        int[] nums = {10, 77, 25, 56,45,20};
        nums[2]=0;//replaces the value at index no 2 with zero
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }
}
