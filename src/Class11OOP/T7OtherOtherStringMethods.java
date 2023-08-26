package Class11OOP;
/*You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
How would you find out how many sentences are in that String?
        How would you reverse a String word by word? for example
// input=>This is sentence i want to reverse
// output=>sihT si ecnetnes i tnaw ot esrever*/

public class T7OtherOtherStringMethods {
    public static void main(String[] args) {
        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] newString=a.split("[?]");
        System.out.println(newString.length);

        for (int i = a.length()-1; i >=0 ; i--) {
            System.out.print(a.charAt(i));

        }

            }

}
