package PracticeQuestions;

public class replit130 {
    public static String thirdLetter(String s){
        String c="";
        for (int i = 0; i < s.length(); i+=3) {
            c=c+s.charAt(i);
        }
        return c;
    }
    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }


    }


