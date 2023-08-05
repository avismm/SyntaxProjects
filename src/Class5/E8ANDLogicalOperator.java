package Class5;

// using a method that ignores the case of the word
public class E8ANDLogicalOperator {
     public static void main(String[] args) {
         double math=98;
         double phy=98;
         double chem=78;

         if(math>90&&phy>89&&chem>90){
             System.out.println("You are an excellent student");
         }else {
             System.out.println("You need to improve");
         }
    }
}
