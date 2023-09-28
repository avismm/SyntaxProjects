package PracticeQuestions;

public class ClassFirstSecondInterfaces implements FirstInterface, SecondInterface{
    public void firstMethod(){
        System.out.println("First Method implementing multiple Inheritance");
    }
    public void secondMethod(String name){
        System.out.println("Second Method implementing multiple Inheritance");
    }
    public static void main(String[] args){
        FirstInterface[] obj1={new ClassFirstSecondInterfaces()};
        SecondInterface[] obj2={new ClassFirstSecondInterfaces()};
        for(FirstInterface f1:obj1){
            f1.firstMethod();
        }
        for(SecondInterface f2:obj2){
            f2.secondMethod("Alex");
        }
    }
}
