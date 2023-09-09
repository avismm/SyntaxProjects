package Class19MethodOverloadingAndOverriding;

public class T6CreditClass {


    public void calcInterest(double balance){
        double interest=3.4;
        System.out.println("Interest amount is "+(balance*interest));
    }

    public static void main(String[] args) {
        new AX().calcInterest(6000);
        new Visa().calcInterest(6000);
    }
}
class AX extends T6CreditClass{

  /*  overriding the method in the parent class and applying different interest rate and balance
    argument of the method must be the same including the order.*/
    @Override

   /* Note: In overriding, we cannot decrease the visibility of the method from the parent class.
    e.g., the method in the parent cannot be public and then default in the child class.
    However, we can increase visibility of the method at child level. e.g., if the method in the parent
    class has default access modifier, the method in the child class can have a public access modifier.
    */
    public void calcInterest(double balance){
        double interest=3.1;
        System.out.println("Interest rate= "+(balance*interest));
    }
}

//This child class inherits methods from the parent class (no overriding has been applied)
class Visa extends T6CreditClass{

}
