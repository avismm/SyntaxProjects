package Class11OOPStringClass;

public class E11OtherOtherStringMethodsSplitMethod {
    public static void main(String[] args) {
        String str="Hi how are you.I am good.I am driving";
      //  String[] split=str.split(".\\s");// this will split the words by the dot and space between them.
        String[] split=str.split("\\s");// this will split the words by the space between them.
        System.out.println(split.length);
       System.out.println(split[3].trim());

            }

}
