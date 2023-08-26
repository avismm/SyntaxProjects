package Class11OOP;
/*Create a String that will hold a sentence.
        Write a program to get a new String without any spaces.*/
public class T5OtherOtherStringMethods {
    public static void main(String[] args) {
        String str="Hi how are you";
      //  String[] split=str.split(".\\s");// this will split the words by the dot and space between them.
        String newString=str.replace(" ","");
        System.out.println(newString);

            }

}
