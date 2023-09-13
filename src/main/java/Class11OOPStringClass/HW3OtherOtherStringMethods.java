package Class11OOPStringClass;
/*You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
How would you find out how many sentences are in that String?*/

public class HW3OtherOtherStringMethods {
    public static void main(String[] args) {
        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] newString=a.split("[?]");
        System.out.println(newString.length);

            }

}
