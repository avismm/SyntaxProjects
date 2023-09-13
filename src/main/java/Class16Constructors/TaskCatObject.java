package Class16Constructors;

public class TaskCatObject {
    public static void main(String[] args) {
        TaskCat cat1=new TaskCat("Ketty", 2,1.2,'M');
        cat1.printInfo();

        TaskCat cat2=new TaskCat("Tina", 1,0.9,'F',"blue", "red" );
        cat2.printInfo();

    }

}
