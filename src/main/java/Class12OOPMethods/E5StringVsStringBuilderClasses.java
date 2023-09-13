package Class12OOPMethods;

public class E5StringVsStringBuilderClasses {
    public static void main(String[] args) {

       /*Strings are immutable. A new string is created in the memory
       every time we change the value of the String.
       Whenever we create a string variable, Java will check in the memory
        if the same memory allocation for that string already exists. If it does, it will simply point
        the new reference to that string without creating a new memory location.
        So for Strings, the computer will point the new variable to an existing memory location.*/
        String name="Barber";
        name.toLowerCase();
        System.out.println(name);


       /*Depending on the requirements, sometimes, we may prefer to use StringBuilder instead of String.
       StringBuilder is mutable. Any change induced will modify the existing sequence of
       characters created in the memory. String builder does not allow sharing of memory between different variables.
        This design improves speed but does not optimize memory.

        StringBuffer and String are synchronized while StringBuilder is not
        StringBuffer and String are therefore thread safe while the stringBuilder isn't.
        StringBuilder therefore works well in single threaded environments.

        When it comes to appending/concatenation of strings, it would be preferred to use StringBuilder than String.
        Strings are immutable. So every time we want to concatenate, a new String will have to be created.
        So we have to traverse the existing string in order to copy its characters to the newly created one.
        With StringBuilder, we are performing the operation directly on the initial sequence of characters. We just have to
        append the desired sequence of characters at the end. So we just need to search for the last index and only traverse the
        desired string to be concatenated.
        Although StringBuilder has a performance benefit, sometimes, we prefer to immutability regardless of the performance
        drawbacks presented by the String class*/

        StringBuilder sb=new StringBuilder("Sunday");
        StringBuffer sf=new StringBuffer("Sunday");
        sb.reverse();
        sf.reverse();
        System.out.println(sb);



    }

    }

