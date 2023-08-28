package Class12OOP;

public class LongestCommonPrefixBtnTwoStrings {


    String LongestCommonPrefix (String first, String second){
        int commonLength=0;

        //The minimum length is initialized by the length of the shorter string using the Math.min function.
        int minLength=Math.min(first.length(),second.length());

       /* We will simultaneously loop over both strings and compare the characters located
        at the same indices to check if these characters are equal (as long as we haven't reached the end of one of the strings[the shorter strings]).
         If they are matching, the common length between the two is increased by 1.
         When we have the non-matching characters, we return the longest common prefix.

        */
        while(commonLength<minLength && first.charAt(commonLength)==second.charAt(commonLength)){
            commonLength++;
        }
       /* After exiting the while loop, the sub-string ranging from index zero from any of the two strings
        till the common prefix is returned*/
        return first.substring(0,commonLength);
    }
}
