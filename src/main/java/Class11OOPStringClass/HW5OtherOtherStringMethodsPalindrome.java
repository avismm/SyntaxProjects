package Class11OOPStringClass;
/*How would you check if String is palindrome or not? aba=> true
        Abbc =>false*/

public class HW5OtherOtherStringMethodsPalindrome {
    public static void main(String[] args) {
        String word="aba";
        String reversedWord="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversedWord=reversedWord+word.charAt(i);

        }
        System.out.print(reversedWord);
        System.out.println(" Is palindrome?: "+ reversedWord.equals(word));

    }

}
