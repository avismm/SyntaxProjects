package Class3IfStatementsAndTypeCasting;
//This is the conversion from one data type to another
public class E1TypeCasting {
    public static void main(String[] args) {
        //Recap: byte->short->int->long->float->double
        long age=34;
        //int myAge=age;

        //implicit/auto/widening type casting - means that we are widening the space
        byte number1=10;
        int number2=number1;
        System.out.println(number2);

        float num1=18.931f;
        int num2;
        //type casting example
        num2=(int)num1;
        System.out.println(num2);



    }
}
