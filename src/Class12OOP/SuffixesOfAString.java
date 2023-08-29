package Class12OOP;

import java.util.ArrayList;
import java.util.List;
/*
suffixes are all possible sub-strings that can be derived from a particular string
starting from the end of a string
 */
public class SuffixesOfAString {

    //declaration of the method getSuffixes whose argument is the variable text of data type String.
    //The method returns a list of suffixes
    List<String> getSuffixes(String text) {

        // We are creating a list of strings to store the substrings
        List<String> suffixes = new ArrayList<>();

        //While looping over our given string text, extract all possible sets of substrings using the substring method
        for (int i = 0; i < text.length(); i++) {
            suffixes.add(text.substring(i));

        }
        return suffixes;
    }
}
