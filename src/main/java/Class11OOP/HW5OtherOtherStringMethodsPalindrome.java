package Class11OOP;
/*How would you check if String is palindrome or not? aba=> true
        Abbc =>false*/

public class HW5OtherOtherStringMethodsPalindrome {
    public static void main(String[] args) {
        String word="aba";
        String reverseedWord="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverseedWord=reverseedWord+word.charAt(i);

        }
        System.out.print(reverseedWord);
        System.out.println(" Is palindrome?: "+ reverseedWord.equals(word));

    }

}
