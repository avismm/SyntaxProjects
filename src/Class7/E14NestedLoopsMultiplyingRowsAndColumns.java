package Class7;

public class E14NestedLoopsMultiplyingRowsAndColumns {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 10;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
