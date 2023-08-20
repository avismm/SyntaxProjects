package Class93DArrays;

public class HW2Arrays {
    public static void main(String[] args) {

        String[][] fruits = {{"veggies", "fruits", "dairy", "sweets"}};

        for (String[] array : fruits) {
            for (String C : array)
                System.out.println(C + " ");
            //System.out.println(Arrays.toString(array));

        }

    }
}


