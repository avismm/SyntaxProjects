package Class6;

public class DecrementOperators {
    public static void main(String[] args) {
        /*this is a pre-increment operation. The value of n will be incremented before
        it can be used*/
        int n=56;
        int m=--n;// the value of n will be decreased by 1 and then assigned to the variable m (pre-increment)
        System.out.println("The value of m is "+m);
        System.out.println("The value of n is "+n);
        //System.out.println(n--);
        int o=--n;//The new value of n will be decreased by 1 and then assigned to the variable o
        System.out.println("The value of O is "+o);


    }
}
