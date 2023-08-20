package Class93DArrays;

public class E113DSArraysPrintUsingNextedForLoop {
    public static void main(String[] args) {

        String[][] cars={
                {"BMW","BENZ","AUDI"},
                {"Tesla","Ford","Ford"},
                {"john","peter","Amon"},
                {"Italian","Italian","Italian"}};
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[0].length; j++) {
                System.out.println((cars[i][j]));

            }

        }
        System.out.println();
        //System.out.println(Arrays.deepToString(cars));// for printing 2D arrays
    }

}
