package Class23Encapsulation;

public class E1EncapsulationBankAccount {
    private String name;
    final private long bankAccountNumber;
    private double balance;
    private String userName;
    private String password;
    final private String accountType;

    public E1EncapsulationBankAccount(String name, long bankAccountNumber, double balance, String userName, String password, String accountType) {
        this.name = name;
        this.bankAccountNumber = bankAccountNumber;
        this.userName = userName;
        this.password = password;
        this.accountType = accountType;
    }

    public E1EncapsulationBankAccount(long bankAccountNumber, String userName, String password, String accountType){
        this.bankAccountNumber = bankAccountNumber;
        this.userName = userName;
        this.password = password;
        this.accountType=accountType;

    }

    public E1EncapsulationBankAccount(String userName, String accountType, long bankAccountNumber) {
        this.userName = userName;
        this.accountType = accountType;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getName(){
        return name;
    }

    //creating the getter method to read the bank account number
    public long getBankAccountNumber(){
        return bankAccountNumber;
    }

    //creating a setter method to allow the user to change the value of the name variable
    void setName(String name){
        this.name=name;
    }
    String getAccountType(){
        return accountType;
    }

    // Cannot declare a setter method for final fields
    /*void setAccountType(String accountType){
        this.accountType=accountType;
    }*/
}
