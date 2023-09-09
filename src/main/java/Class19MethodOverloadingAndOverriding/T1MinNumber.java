package Class19MethodOverloadingAndOverriding;

public class T1MinNumber {
    public int minNum(int num1, int num2) {
        return num1 < num2 ? num1 : num2; //using ternary operator
    }

    public double minNum(double num1, double num2) {
        return num1 < num2 ? num1 : num2;//using ternary operator
    }
}



