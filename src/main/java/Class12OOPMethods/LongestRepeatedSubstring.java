package Class12OOPMethods;

public class LongestRepeatedSubstring {


   // String LongestRepeatedSubstring (String text) {
       /* List<String> suffixes = getSuffixes(text);//retrieving the suffixes of a given text
        Collection.sort(suffixes);//sorting the suffixes
        String longestSubstring="";// we will start with an empty string as the longest common prefix.

       *//* we need to loop over the sorted suffixes and for every two adjacent suffixes,
                we need to find the longest common prefix*//*

        for (int i = 0; i < suffixes.size()-1; i++) {
            String lcp=LongestCommonPrefix(suffixes.get(i),suffixes.get(i+1));

           *//* We will the update the longest subString as we find a longer string or
            prefix.*//*
            if(lcp.length()>longestSubstring.length()){

                longestSubstring=lcp;
            }

        }
        return longestSubstring;
    }
}*/
    }