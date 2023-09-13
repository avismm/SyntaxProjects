package Class11OOPStringClass;

public class E5StringMethodsSubString {
    public static void main(String[] args) {
        String str="Batch 17 is A great batch. Just kidding. Please don't take it seriously";
       String subStr=str.substring(6,25);
       /*The character at index 6 is included while
        the last character at index 25 is not included.*/
        System.out.println(subStr);
    }


}
