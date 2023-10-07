package Class29Exceptions;

public class E3ExceptionsHandlingTryCatchBlocks {
    public static void main(String[] args) {

        try {
            //plan a
           // System.out.println(10/0);
            int[] arr=new int[-8];
            arr[1]=1;
            String name=null;
            name.length();

        }catch (ArithmeticException e){
            System.out.println("Don't divide by zero");
        }
        catch (NullPointerException e){
            System.out.println("Check that you did not provide a null value");
        }
        catch (Exception e){
            System.out.println("Something went wrong. Please contact systems admin");
        }

    }

}
