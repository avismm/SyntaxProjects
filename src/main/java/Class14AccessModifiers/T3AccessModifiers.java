package Class14AccessModifiers;

public class T3AccessModifiers {

    public static void main(String[] args) {
       // T3AccessModifiers.vowel("camel");
        System.out.println(getVowel("camel"));
    }
    /*The method will be available only inside the class where it was created,
    and executed by calling its name.

    * */
     private static String getVowel (String text){
        String vowels="";
         for (int i = 0; i < text.length(); i++) {
             char ch=text.charAt(i);
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                 vowels+=ch;
             }

         }
return vowels;
    }

}
