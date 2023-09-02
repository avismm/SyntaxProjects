package PracticeQuestions;

public class replit118 {


    public static void main(String[] args){
        replit118 obj=new replit118();
       obj.spaceOut("technology");
    }

    String spaceOut (String text){
        String ch="";
        for (int i = 0; i < text.length(); i++) {
            ch+=text.charAt(i)+" ";

        }
        System.out.println(ch);
        return ch;

    }
}


