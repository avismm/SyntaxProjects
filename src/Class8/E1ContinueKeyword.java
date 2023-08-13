package Class8;

public class E1ContinueKeyword {
    public static void main(String[] args) {
        //Continue keyword will skip the iteration once the condition
        //within the scope becomes true
        int[] nums={10,34,67,43,56,78,20};
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                continue;// Skip the ith iteration once the if condition becomes true.
            }
            System.out.println("My value is "+nums[i]);

        }
    }
}
