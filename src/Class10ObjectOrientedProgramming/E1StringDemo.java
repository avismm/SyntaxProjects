package Class10ObjectOrientedProgramming;

public class E1StringDemo {
    public static void main(String[] args) {
        // we have created an object (obj) from the string class
        // and have stored Cat inside it
        String obj = new String("cat");

        //shortcut to create objs from String Class
        String obj2 = "Dog"; // String obj2=new String("Dog)

        //There are methods that have already been created in Java
        int len=obj.length(); // Here, we are calling the length method/function/behavior
        System.out.println(len);


    }
}