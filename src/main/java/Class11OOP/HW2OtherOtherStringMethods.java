package Class11OOP;
/*Create a String that should be combination of letters, numbers and special characters.
        Find out how many Alphabets(abd AZ) characters are there in the String.*/
public class HW2OtherOtherStringMethods {
    public static void main(String[] args) {
        String str="Hi2bDa34$%%%*HHDu";
        String newString=str.replaceAll("[^abd AZ]","");
        System.out.println(newString);

            }

}
