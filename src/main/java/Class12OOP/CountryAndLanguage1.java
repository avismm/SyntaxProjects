package Class12OOP;

import java.util.Locale;

public class CountryAndLanguage1 {
    public static void main(String[] args) {
        String countryCode = "UK"; // Change this to the desired country code

        Locale input = new Locale("en", countryCode);
        String language = input.getDisplayLanguage();

        System.out.println("Country Code: " + countryCode);
        System.out.println("Language: " + language);

    }

}

