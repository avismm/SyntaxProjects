package Class19MethodOverloadingOverridingAndSuperKeyword;

public class MinNumberTester {
    public static void main(String[] args) {
        /*calling the default constructor of the T1 class and creating an object of it, then storing the
        object on the min variable.*/

        T1MinNumber min=new T1MinNumber();

        //calling the methods and printing out the results
        System.out.println(min.minNum(67,89));
        System.out.println(min.minNum(56.34,54.23));

    }
}
