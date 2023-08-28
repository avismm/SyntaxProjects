package Class12OOP;

public class E5StringVsStringBuilderClasses {
    public static void main(String[] args) {

       /*Strings are immutable. A new string is created in the memory
       every time we chane the value of the String.
       Whenever we create a string variable, Java will check in the memory
        if the same memory allocation for that string already exists.
        For Strings, the computer will point the variable to an existing memory location.
        Depending on the requirements, sometimes, we may prefer to use String instead of StringBuilder.*/
        String name="Barber";
        name.toLowerCase();
        System.out.println(name);


       /* StringBuilder is mutable. Any change induced will modify the existing sequence of
       characters created in the memory.
       String builder does not allow sharing of memory between different variables.
        This design improves speed but does not optimize memory.
        String buffer and String are synchronized while String builder is not
        String buffer and String are thread safe while the stringBuilder isn't. StringBuilder works well in single threaded
        environments*/
        StringBuilder sb=new StringBuilder("Sunday");
        StringBuffer sf=new StringBuffer("Sunday");
        sb.reverse();
        sf.reverse();
        System.out.println(sb);



    }

    }

