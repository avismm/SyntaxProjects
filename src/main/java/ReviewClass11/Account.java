package ReviewClass11;

public class Account {
    private double accountBalance;
    Account(double accountBalance){
        this.accountBalance=accountBalance;
    }
    void transferFunds(double amount) throws InsufficientAccountBalanceException{//throws indicates the type of exception that can be thrown
        if(amount>accountBalance){
            throw new InsufficientAccountBalanceException("You do not have enough funds");
        }
    }
}

class AccountTester{
    public static void main(String[] args) {
        Account account=new Account(100);
        account.transferFunds(12000);
    }
}