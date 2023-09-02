package Class93DArrays;

public class E73DSArraysPrintUsingNestedForLoops {
    public static void main(String[] args) {

        int [][] numbers={
                {10,20,30,40,50},
                {15,30,35,45,20},
                {16,20,32,22,30},
        };
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[0].length; col++) {
                System.out.print(numbers[row][col]+" ");
               // System.out.print(numbers.toString());
            }
            System.out.println();
        }
}

}
