package Class7NestedLoopsAndArrays;

public class E13AnotherWayToCreateAnArray {
    public static void main(String[] args) {
        /*//only creating an array
        Java will initialize everything with zero for integers and null with strings
        =>Char will be initialized with null
        =>boolean wil be initialized with false*/
        int[] prices= new int[5];
        prices[0]=1000;
        prices[2]=4000;
        System.out.println(prices[2]);

    }
}
