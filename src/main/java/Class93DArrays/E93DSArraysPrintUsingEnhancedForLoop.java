package Class93DArrays;

public class E93DSArraysPrintUsingEnhancedForLoop {
    public static void main(String[] args) {

        String[][] names={
                {"john","peter","Amon","Haman"},
                {"john","peter","Amon","Haman"},
                {"john","peter","Amon","Haman"},
                {"john","peter","Amon","Haman"}};
        for(String [] array : names) {
            for(String v:array)
            System.out.print(v+" ");
        }
        System.out.println();
        //System.out.println(Arrays.deepToString(names));// for printing 2D arrays
    }

}
