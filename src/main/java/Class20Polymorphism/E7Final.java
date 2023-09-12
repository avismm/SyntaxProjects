package Class20Polymorphism;

public class E7Final {
    public static void main(String[] args) {

        /*Whenever something is final, no one can change the value of the variable.
        As a convention the variables are created in upper case. Classes, methods, and variables can also
        be made final. If a class is final, it cannot be inherited by other classes. If a method
        is final, it cannot be overriden*/
        final int AGE=10;
    }
}
class parent{
   //making the method or variable in the parent class final
    final String religion="Xtian";
    final void marry(){
        System.out.println("take our permission first");
    }
}
class child extends parent{

}
