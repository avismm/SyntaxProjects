package Class12OOP;

/*Create a method that will print whether given String is palindrome or not.*/

public class T4ReverseString {

    void palindrome(String word1){
        boolean result;
        StringBuilder reversed =new StringBuilder(word1);
        reversed.reverse();

        /*Since we cannot compare Strings with StringBuilder objects,
        Line 13 below will create a new String object word2 that contains
        the same characters as the original StringBuilder object reversed.That was,
        we are able to compare values of the same data type. */
       String word2=reversed.toString(); //Converts the value
        if(word1.equals(word2)){
            result=true;
        }else{
            result=false;
        }
        System.out.println(word2);
        System.out.println(result);

    }



}

