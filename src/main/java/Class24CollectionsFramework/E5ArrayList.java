package Class24CollectionsFramework;

public class E5ArrayList {
    public static void main(String[] args) {

        //This concept of converting a primitive data type to a class is called boxing
        Integer number1=10;
        int f=number1; //This is called auto unboxing. The Integer variable number will be auto assigned to int f
        System.out.println(f);

        //Equivalent syntax
        Integer number2 =new Integer(10);

        //Converting from a class to a primitive. This is called unboxing.
        int d=number2.intValue();
        System.out.println(d);

        //Alternative way of boxing
        int a=10;
        Integer number4=new Integer(a);
        System.out.println(number4);
    }
}
