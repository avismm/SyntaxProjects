package PracticeQuestions;

public class replit119 {


    public static void main(String[] args){
        replit119 obj=new replit119();
        obj.censorLetter("computer science",'e');
        obj.censorLetter("trick or treat",'t');
    }

    void censorLetter (String text1, char text2){
        System.out.println(text1.replace(text2,'*'));
    }
}


