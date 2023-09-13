package Class11OOPStringClass;

public class E13OtherOtherStringMethodsSplitMethod {
    public static void main(String[] args) {
        String str="Hi how are you#I am good#I am driving";
      //  String[] split=str.split(".\\s");// this will split the words by the dot and space between them.
        String[] split=str.split("#");//creates an array of string elements and stores them inside the variable "split"
        System.out.println(split.length); // prints out the length of the array
char[] arr=str.toCharArray();
        for(char c:arr){
            System.out.print(arr);// This will print out the elements of the array
        }
       //System.out.println(split[3].trim());

            }

}
