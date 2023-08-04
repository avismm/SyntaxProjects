package Class3;

public class ReviewClassTypeCasting {
    public static void main(String[] args) {
        int number1=(int)10.5284935;
        // this example is converting a float into an integer so the decimals will be lost.
        float number2=(int)10;
        //converting from a smaller to a bigger data type is redundant as java can do it automatically
        System.out.println(number2);
        System.out.println(number1);

        float number3=20.100f;
        double number4=number3;
        /* in the example above, not that a computer converts everything into ones and zeros before
        it converts into the new data type*/
        System.out.println(number4);
        //boolean bool=(boolean)12.5 error: Cannot type cast double to boolean
        char c=(char)45; //explicit conversion (from the bigger int to a smaller char). In this example, this will convert from the integer number to a character
        System.out.println(c);
        //String s=(String)'C'; // error: type casting does not work with non premitive data types

    }
}
