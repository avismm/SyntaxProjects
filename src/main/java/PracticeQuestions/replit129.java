package PracticeQuestions;

public class replit129 {

    static String country;
    static String continent;
    void printInfo(){
        System.out.println(country+" located on "+continent+" continent");
    }
}
class Tester {
    public static void main(String[] args) {
        replit129 obj=new replit129();
        replit129.country="Moroco";
        replit129.continent="Africa";
        obj.printInfo();
    }

}



