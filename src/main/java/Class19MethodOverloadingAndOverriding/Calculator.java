package Class19MethodOverloadingAndOverriding;

public class Calculator {
    public void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    public void add(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }
    public void add(double num1, int num2){
        System.out.println(num1+num2);
    }
    public void add(int num1, double num2){
        System.out.println(num1+num2);
    }
    public static void main(String[] args) {
Calculator c=new Calculator();
c.add(20,20);
c.add(34,56,8);
c.add(34.6,45);
c.add(46, 76.8);
    }
}


