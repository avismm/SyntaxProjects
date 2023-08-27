package Class12OOP;

public class E5StringVsStringBuilderClasses {
    public static void main(String[] args) {

        //Whenever we create a string variable, Java will check in the memory
        // if the same memory location for that string already exists. For Strings, the computer will point the variable
        //to an existing memory location. Depending on the requirements, sometimes, we may prefer to use
        // String instead of String builder
        String name="Barber";
        name.toLowerCase();
        System.out.println(name);

        
        //String builder does not allow sharing of memory between different variables.
        // This design improves speed but does
        //not optimize memory.
        //String buffer is not thread safe while the string buffer is thread safe
        StringBuilder sb=new StringBuilder("Sunday");
        StringBuffer sf=new StringBuffer("Sunday");
        sb.reverse();
        sf.reverse();
        System.out.println(sb);



    }

    }

