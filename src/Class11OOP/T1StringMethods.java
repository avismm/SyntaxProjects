package Class11OOP;

/*Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters,
        print the character in the middle of the String.
        For Example String str=hello =>l*/
public class T1StringMethods {
    public static void main(String[] args) {
        String str="elephant.";
        if(!str.isEmpty()) {
            if (str.length() % 2 != 0 && str.length() >= 3)
                System.out.println(str.charAt(str.length() / 2));
        }


}


}
