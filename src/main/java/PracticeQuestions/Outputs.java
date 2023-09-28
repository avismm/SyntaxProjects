package PracticeQuestions;

public interface Outputs {

}

interface Functions extends Outputs{

    static double adding(double firstNumber, double SecondNumber){
        double sum = firstNumber+SecondNumber;
        System.out.println("Result is ::: "+sum);
        return sum;
    }

    static double subtracting(double firstNumber, double SecondNumber){
        double diff= firstNumber-SecondNumber;
        System.out.println("Result is ::: "+diff);
        return diff;
    }

    static double multiply(double firstNumber, double SecondNumber){
        double multiple= firstNumber*SecondNumber;
        System.out.println("Result is ::: "+multiple);
        return multiple;
    }

    static double dividing(double firstNumber, double SecondNumber){
        double division= firstNumber/SecondNumber;
        System.out.println("Result is ::: "+division);
        return division;
    }

}
