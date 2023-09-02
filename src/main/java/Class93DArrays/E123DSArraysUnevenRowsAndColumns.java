package Class93DArrays;

public class E123DSArraysUnevenRowsAndColumns {
    public static void main(String[] args) {

    int [][] numbers={
            {10,20,30,40,50},
            {40,20,30},
            {40,20,30,40,50}
            };
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.print(numbers[row][col]+" ");;

            }
            System.out.println();
        }


}

}
