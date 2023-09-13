package Class12OOPMethods;

import java.util.ArrayList;
import java.util.List;

public class PrefixesOfAString {

    //declaration of the method getSuffixes whose argument is the variable text of data type String.
    //The method returns a list of suffixes
    List<String> getPreffixes(String text) {

        // We are creating a list of strings to store the substrings
        List<String> preffixes = new ArrayList<>();

        //While looping over our given string text, extract all possible sets of substrings using the substring method
        for (int i = 1; i <= text.length(); i++) {
            preffixes.add(text.substring(0,i));
        }
        return preffixes;
    }
}
