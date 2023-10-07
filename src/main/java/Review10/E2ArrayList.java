package Review10;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        int[] numbers =new int[10];
        ArrayList<Integer> nums= new ArrayList<>();
        for (int i = 5; i < 30; i+=5) {
            nums.add(i);
        }
        System.out.println(nums);
        nums.remove(new Integer(20));//creating the object of number 20 to remove the value
        System.out.println(nums);

    }

}
