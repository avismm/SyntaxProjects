package PracticeQuestions;

public class repl171 {

    public static void main(String [] args){
        Parent1[] obj={new example()};
        for(Parent1 p:obj){
            p.m1("Alex","gmail.com");
            p.m1(true);
        }

    }
}

abstract class Parent1{

    public abstract void m1(String name, String email);
    public abstract void m1(boolean isHealthy);

}

class example extends Parent1{

    public void m1(String name, String email){
        System.out.println(name +" "+email);
    }

    public void m1(boolean isHealthy){
        System.out.println("You are healthy");
    }

}
