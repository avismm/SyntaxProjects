package ReviewClass9;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="cat";
        String s2="cat";
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean IsAnagram =Arrays.equals(c1,c2);
        System.out.println(IsAnagram);
    }


}
