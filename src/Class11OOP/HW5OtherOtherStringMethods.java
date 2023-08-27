package Class11OOP;
/*How would you check if String is palindrome or not? aba=> true
        Abbc =>false*/

public class HW5OtherOtherStringMethods {
    public static void main(String[] args) {
        String word1="aba";
        String word2="";
        for (int i = word1.length()-1; i >=0 ; i--) {
            word2=word2+word1.charAt(i);

        }
        System.out.print(word2);
        System.out.println(" Is palindrome?: "+ word2.equals(word1));

    }

}
