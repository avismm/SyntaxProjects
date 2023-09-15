package ReviewClass8;

public class OverloadingTester {
    public static void main(String[] args) {
        new Overloading().print();
        new Overloading().print(34, "Cat");

        //There is no exact match for this method call so Java will apply type casting if possible
        new Overloading().print(56);

        //If there is no complete match, Java will try to call the variable arguments method if available
        new Overloading().print(90,34,56,78,34);

//        //Other overloaded methods
//        System.out.println(Math.abs(-78));
//        Scanner input=new Scanner(System.in);
//        input.nextByte(4);
//        String str=String.valueOf(67);
//        // String.valueOf(4);
    }
}
