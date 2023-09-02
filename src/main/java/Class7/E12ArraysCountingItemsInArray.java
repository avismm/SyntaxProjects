package Class7;

public class E12ArraysCountingItemsInArray {
    public static void main(String[] args) {
                   /*String name1="Sean";
                   String name2="Sam";*/
                   String [] names={"ali","Sam","Mike",};//Different data types cannot be stored in the same array.
        names[2]="Avis";
        for (int i = 0; i < names.length; i++) {
            System.out.print(" "+names[i]+",");
        }
    }
}
