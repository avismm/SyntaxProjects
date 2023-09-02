package Class11OOP;

public class E6MethodChaining {
    public static void main(String[] args) {
        String str="BATCH 17 is GREAT";
        String newString=str.replace("good","great");
        System.out.println(newString);

        /*Note: When multiple methods are being called on the same line,
        it is called method chaining. String class supports method chaining.
        For method chaining to work, previous method must return the expected data type to the next method in the chain.*/
        System.out.println(str.toLowerCase().trim().replace("great","Good"));
    }


}
