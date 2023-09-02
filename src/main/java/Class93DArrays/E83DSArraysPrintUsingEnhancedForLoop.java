package Class93DArrays;

public class E83DSArraysPrintUsingEnhancedForLoop {
    public static void main(String[] args) {

        int [][] numbers={
                {10,20,30,40,50},
                {15,30,35,45,20},
                {16,20,32,22,30},
        };
        for (int[] row: numbers) {
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
}

}
