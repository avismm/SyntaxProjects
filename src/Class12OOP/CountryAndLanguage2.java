package Class12OOP;

import java.util.Locale;

public class CountryAndLanguage2 {
     String getLanguage(String countryCode) {
        Locale input = new Locale("en", countryCode);
        String language = input.getDisplayLanguage();
         System.out.println("Country Code: "+countryCode);
         System.out.println("Language: "+language);
            return language;
    }
}
