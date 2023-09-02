package Class14AccessModifiers;

public class T2AccessModifiers {


    // Here, we are using the default access modifier.
     public static String string (String text){
        String reversed="";
        StringBuilder result =new StringBuilder(text).reverse();
        reversed= result.toString();
        System.out.println(reversed);
        return reversed;

    }

}
