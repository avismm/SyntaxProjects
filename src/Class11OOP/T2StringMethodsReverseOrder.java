package Class11OOP;

//print a string and print it in reverse order
public class T2StringMethodsReverseOrder {
    public static void main(String[] args) {
        String str="elephant.";
        System.out.println(str);
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
}
}

/* Note: During debugging, you can click any line of code and click on the
evaluation expression icon to see the output.
This technique works only during debugging*/
