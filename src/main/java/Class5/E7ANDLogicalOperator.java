package Class5;

// using a method that ignores the case of the word
public class E7ANDLogicalOperator {
     public static void main(String[] args) {
         //Example 1
       /*boolean cond1=false;
        boolean cond2=false;
        boolean cond3=true;
        boolean cond4=true;
        boolean cond5=true;
        boolean result=cond1&&cond5&&cond2&&cond3&&cond4;
         System.out.println(result);*/
         boolean creditScore=true;
         boolean previousDefaultStatus=false;
         boolean minWedge=true;

         if(creditScore&&minWedge&&!previousDefaultStatus){
             System.out.println("You can have a loan");
         }else {
             System.out.println("You cannot have a loan. You must satisfy the requirements");
         }
    }
}
