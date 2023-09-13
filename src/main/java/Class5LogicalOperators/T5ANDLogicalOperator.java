package Class5LogicalOperators;

// using a method that ignores the case of the word
public class T5ANDLogicalOperator {
 /*   Write a program that checks if the country is not equal to China*/
    public static void main(String[] args) {
        int day=1;
        if(day>=1&& day<=5){
            System.out.println("It is a weekday");
        }else if(day==6||day==7){
            System.out.println("It is a weekend");
        }else{
            System.out.println("Invalid day was entered");
        }

    }
}
