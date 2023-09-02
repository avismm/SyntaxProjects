package Class12OOP;

public class AppendingUsingStringBuilder {
    public static void main(String[] args) {

        //With StringBuilder the old value in the memory is modified when the old value is modified.
        StringBuilder sb =new StringBuilder("Some animals");
        sb.append(" are wild");
        System.out.println(sb);
        System.out.println(sb.length());
        char charAt0=sb.charAt(0);
        System.out.println(charAt0);

//Strings are immutable so the new result must be stored in a new variable.
        String str="Some animals";
       String result =str.concat(" are not wild");
        System.out.println(result);
        System.out.println(result.length());
        char CharAt0=result.charAt(4);
        System.out.println(charAt0);
    }


}
