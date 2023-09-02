package Class8;

//Replace numbers that are greater than 20 with zero in an array
public class E4Arrays {

    public static void main(String[] args) {
        int[] nums = {10, 77, 25, 56,45,20};
          for (int i = 0; i < nums.length; i++) {
              if(nums[i]>20)
                  nums[i]=0;
            System.out.println(nums[i]);

        }
    }
}
