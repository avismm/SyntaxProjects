package Class93DArrays;

public class HW3Arrays {
    public static void main(String[] args) {

        int[][] nums = {{1,2,3,},{4,5,6,},{7,8,9,}};

        for (int[] array : nums) {
            for (int C : array)
                System.out.print(C + " ");
            //System.out.println(Arrays.toString(array));

        }
        System.out.println();

    }
}


