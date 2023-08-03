package ReviewClass1;

public class E3VariablesIncludesOtherWaysToInitializeVariables {
    public static void main(String[] args) {
       //crating multiple variables on the same line
        int age, number, noOfGoods;
        age=15;
        number=78;
        noOfGoods=25;
        System.out.println(age+" "+number+" "+noOfGoods);
        System.out.println(age+" "+number+noOfGoods);
        String op1=age+" ";
        String op2=op1+number;
        String op3=op2+noOfGoods;
        //System.out.println(op3);
        System.out.println(op2);
        System.out.println(age+ number+" "+noOfGoods);
        System.out.println(12+" "+5*5);

        //another way to create variables
        int size=10,noOfCars=50,noOfTyres=16;



    }


}
