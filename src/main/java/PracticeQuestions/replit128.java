package PracticeQuestions;

public class replit128 {

    static String mixString(String s1, String s2){
        String s3="";
        StringBuilder combinedString = new StringBuilder();

   /* for (int i = 0; i < s1.length(); i++) {
      for (int j = 0; j < s2.length(); j++) {
      combinedString.append(s1.charAt(i));
      combinedString.append(s2.charAt(i));
}
}*/
        int maxLength = Math.max(s1.length(), s2.length());
        for (int i = 0; i < maxLength; i++) {
            if (i < s1.length()) {
                combinedString.append(s1.charAt(i));
            }
            if (i < s2.length()) {
                combinedString.append(s2.charAt(i));
            }
        }
        s3=combinedString.toString();
        System.out.println("Combined String: " + s3);
        return s3;
    }

    //test case below (dont change):
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);

    }

}
