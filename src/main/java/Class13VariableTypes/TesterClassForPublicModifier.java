package Class13VariableTypes;

import Class14AccessModifiers.BankAccount;

public class TesterClassForPublicModifier {
    public static void main(String[] args) {
        BankAccount acc =new BankAccount();
        //accountNumber cannot be accessed because the class TesterClassForPublicModifier is in a different package
        //acc.accountNumber;
        acc.accountBalance=5656;
        System.out.println(acc.accountBalance);

    }


}
