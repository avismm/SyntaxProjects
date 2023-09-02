package Class14AccessModifiers;

public class T3AccessModifiersApproach2 {

    public static void main(String[] args) {
       // T3AccessModifiers.vowel("camel");
        System.out.println(vowel("intergalactic"));
    }
    /*The method will be available only inside the class where it was created,
    and executed by calling its name.

    * */
     private static String vowel (String text){
        text= text.replaceAll("[^aeiouAEIOU]","");
return text;
    }

}
