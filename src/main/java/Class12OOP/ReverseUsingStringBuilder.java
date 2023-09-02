package Class12OOP;

public class ReverseUsingStringBuilder {

    String reverse(String text){
        return new StringBuilder(text).reverse().toString();

    }
}
