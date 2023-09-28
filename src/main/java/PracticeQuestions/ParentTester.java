package PracticeQuestions;

public class ParentTester implements ChildInterface{
    public void childMethod(){
        System.out.println("Child Method-hello Syntax");
    }
    public void parentMethod(){
        System.out.println("Parent Method-welcome to Syntax");
    }
    public static void main(String[] args){
        ChildInterface[] obj={new ParentTester()};
        for(ChildInterface i:obj){
            i.parentMethod();
            i.childMethod();
        }
    }
}
