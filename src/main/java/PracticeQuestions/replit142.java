package PracticeQuestions;

public class replit142 {
    private String schoolName;

    private int batch;

    private int year;

    private String lastDayOfClass;

    public replit142(String schoolName, int batch, int year, String lastDayOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;

    }
    public replit142(){

    }
    void printResults(){
        System.out.println(schoolName+" "+batch+" "+ year+" "+ lastDayOfClass);
    }

    public static void main(String[] args){
        replit142 obj1=new replit142("Syntax",6,2020,"07/30/2020");

        replit142 obj2=new replit142();
        obj2.printResults();
        obj1.printResults();
    }

}


