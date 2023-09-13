package Class11OOPStringClass;

public class E9OtherOtherStringMethodsSplitMethod {
    public static void main(String[] args) {
        String str="Hi how are you. I am good. I am driving";
        String[] split=str.split("[.]"); // This will split the strings based on the dot between them.
        System.out.println(split.length);
        System.out.println(split[2].trim());

            }

}
