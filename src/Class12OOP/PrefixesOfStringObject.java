package Class12OOP;

/*Reversing a text using the StringBuilder class*/

import java.util.List;

public class PrefixesOfStringObject {

    public static void main(String[] args) {
        PrefixesOfAString obj=new PrefixesOfAString();

     List<String> result= obj.getPreffixes("sugarcane");
        System.out.println(result);
    }


}

