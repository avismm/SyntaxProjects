package Class2Variables;

public class T12StringConcat {
    public static void main(String[] args) {
        // a String cannot be subtracted, multiplied, or divided by other data types
        String msg="My age is ";
        int age =20;
        String result=msg+age;
        System.out.println(result);
        System.out.println("my age is "+ (10+10));
        System.out.println(2+2*2);
        System.out.println("10"+10);
        System.out.println("10"+10+10);
        System.out.println("10"+(10+10));
        System.out.println("10"+10*10);

    }
}
