package Class8;

public class Task2Arrays {
   /* A program to count the number of false elements
    in an array.*/
    public static void main(String[] args) {
        int[] nums = {10, 20, 4, 3, 8,45,96};
        int i = 0;
        int count = 0;
        while (i <nums.length) {
            if (nums[i]>10) {
                count++;
            }
            i++;
        }
        System.out.print(count + " ");
    }
}
