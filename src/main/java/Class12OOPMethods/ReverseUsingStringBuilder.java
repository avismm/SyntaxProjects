package Class12OOPMethods;

public class ReverseUsingStringBuilder {

    String reverse(String text){
        return new StringBuilder(text).reverse().toString();

    }
}
