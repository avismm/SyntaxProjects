package Class29Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E4ExceptionsHandlingTryCatchBlocks {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
            //plan a
           // System.out.println(10/0);
            int[] arr=new int[-8];
            arr[1]=1;
            String name=null;
            name.length();

            //In this example, java will force us to handle the exception.
        //There are two categories of exception.
        //1)Checked exception.Cannot be handled by simply writing an if else condition
        //2)Unchecked exceptions. Most of them can be handled by simple if else conditions.
        FileInputStream f=new FileInputStream("File");//Java will provide a default handler to handle the error
        Thread.sleep(2000);

    }

}
