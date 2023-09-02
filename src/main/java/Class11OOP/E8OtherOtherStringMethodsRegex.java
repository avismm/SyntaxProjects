package Class11OOP;

public class E8OtherOtherStringMethodsRegex {
    public static void main(String[] args) {
        String str="baTC%#&*@45H()17isGR&45T";
      /*
        Regular expression (regex) example.
        If anywhere in the string, if there is any letter present
        from A-Z, find it and replace it with =.
        This technique is linked to the ASCII table.
        i.e., the system will replace all the characters from the ASCII table that are within
        the specified range*/

       System.out.println(str.replaceAll("[A-Z]","="));
       System.out.println(str.replaceAll("[a-z]","="));
       System.out.println(str.replaceAll("[A-Z]",""));
       System.out.println(str.replaceAll("[&-;]",""));

       //multiple ranges can also be specified for replacement
        System.out.println(str.replaceAll("[A-Z0-9]",""));
        System.out.println(str.replaceAll("[A-Z0-58-9a-j]",""));
        System.out.println(str.replaceAll("[Ak7S]",""));

        //Removing any digit. More about this syntax can be found on regex.com
        System.out.println(str.replaceAll("\\d","")); //removes all digits
        System.out.println(str.replaceAll("[^A-Z0-9]","")); // means that java will remove everything other than upper case letters from A-Z and numbers 0 to 9.
            }

}
