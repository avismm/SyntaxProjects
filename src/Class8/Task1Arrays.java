package Class8;

public class Task1Arrays {
   /* A program to count the number of false elements
    in an array.*/
    public static void main(String[] args) {
        boolean[] booleans = {true, false, true, false, false};
        int i = 0;
        int count = 0;
        while (i <booleans.length) {
            if (!booleans[i]) {
                count++;
            }
            i++;
        }
        System.out.print(count + " ");
    }
}
