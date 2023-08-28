package Class12OOP;

/*Reversing a text using the StringBuilder class*/

import java.util.List;

public class SuffixesOfStringObject {

    public static void main(String[] args) {
        SuffixesOfAString  obj=new SuffixesOfAString();

     List<String> result= obj.getSuffixes("sugarcane");
        System.out.println(result);
    }


}

