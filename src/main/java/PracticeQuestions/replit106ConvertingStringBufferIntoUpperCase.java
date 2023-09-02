package PracticeQuestions;

public class replit106ConvertingStringBufferIntoUpperCase {
    public static void main(String[] args) {
     //   String value = "Hello";
        StringBuffer string = new StringBuffer();
       string.append("hello");
        string.append(" world");
       String  string2=string.toString().toUpperCase();
        System.out.println(string2);
    }

}

