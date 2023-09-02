package Class10OOP;

public class E8StringDemoTrimMethod {
    public static void main(String[] args) {

        String name1="  Arthur    ";

        //This method will remove all the spaces before and
        //after the string. If more than one space exists, java will remove
        //the space at the end of the string
        System.out.println(name1.trim());
        
    }
}