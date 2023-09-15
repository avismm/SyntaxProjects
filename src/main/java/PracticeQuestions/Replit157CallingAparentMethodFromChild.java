package PracticeQuestions;

public class Replit157CallingAparentMethodFromChild {
    public static void main (String[] args){
        new ChildClass().m2();

    }
}

class Parent {
    void m1(){
        System.out.println("m1 method in parent class");
    }

}
class ChildClass extends Parent {
    void m1(){
        System.out.println("m1 method in child class");
    }
    void m2(){
        m1();
        super.m1();
    }


}
