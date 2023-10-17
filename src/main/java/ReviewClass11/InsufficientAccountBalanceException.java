package ReviewClass11;

/***
 * This exception is thrown when user does not ave enough balance
 */
public class InsufficientAccountBalanceException extends RuntimeException{
    public InsufficientAccountBalanceException(String msg){
        super(msg);
    }
}
