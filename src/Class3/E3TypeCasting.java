package Class3;
//This is the conversion from one data type to another
public class E3TypeCasting {
    public static void main(String[] args) {
        //Recap: byte->short->int->long->float->double

        int number1=129;
        byte number2=2;
        //type casting example
        number2=(byte)number1;
        System.out.println(number2);

        short box1=2000;
        int box2=box1; //This is implicit/auto type casting. Note that "short" is smaller than "int'


    }
}
