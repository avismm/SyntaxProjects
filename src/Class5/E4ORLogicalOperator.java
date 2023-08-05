package Class5;

// using a method that ignores the case of the word
public class E4ORLogicalOperator {
 /*   Write a program that checks if the country is not equal to China*/
    public static void main(String[] args) {
        boolean cond1=false;
        boolean cond2=false;
        boolean cond3=true;
        boolean cond4=cond1||cond2||cond3;
        System.out.println(cond4);
    }
}
