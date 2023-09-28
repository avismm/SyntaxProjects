package Class23Encapsulation;

public class BankAccountTester {
    public static void main(String[] args) {
E1EncapsulationBankAccount b=new E1EncapsulationBankAccount("John",3474555,78999999,"amuhwerane","pass23734","testing");
        System.out.println(b.getName());
        System.out.println(b.getBankAccountNumber());
        b.setName("Avis");
        System.out.println(b.getName());

    }
}
