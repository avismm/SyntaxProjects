package Class24CollectionsFramework;

import java.util.ArrayList;

public class E3ArrayListWrapperClasses {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();

        //All operations that we can do with the primitive data types can be done
        //with the wrapper classes
        Integer num1=new Integer(10);
        Integer num2=new Integer(30);
        System.out.println(num1+num2);

        // We can also use the wrapper classes directly to create objects just like we do for the string class

        Integer num3=45;
        Integer num4=80;
        System.out.println(num3+num4);

    }
}
