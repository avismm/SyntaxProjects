package Class14AccessModifiers;

public class BankAccount {
   private String name="fahim";
    private String userName="Fahim123";
    private String password="pass456";
    public double accountBalance;
     String accountNumber="123345";

    private void printInfor(){ // will not be accessible by other classes
     System.out.println("Am Avis from Batch 17");
 }
    public static void main(String[] arg){
        BankAccount bankAccount=new BankAccount();
        System.out.println(bankAccount.name);

    }


}
