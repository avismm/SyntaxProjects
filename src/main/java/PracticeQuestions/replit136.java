package PracticeQuestions;

public class replit136 {
    private void method1(){

        System.out.println("This is a private method");

    }

    void method2(){
        System.out.println("This is a default method");
    }

    protected void method3(){
        System.out.println("This is a protected method");
    }

    public void method4(){
        System.out.println("This is a public method");
    }

}

class methodTester{
    public static void main(String[] args){
        replit136 obj=new replit136();
        //obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();;

    }

    }


