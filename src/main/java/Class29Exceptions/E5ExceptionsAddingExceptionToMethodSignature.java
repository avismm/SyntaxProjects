package Class29Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E5ExceptionsAddingExceptionToMethodSignature {
    public static void main(String[] args) {
        E5ExceptionsAddingExceptionToMethodSignature e=new E5ExceptionsAddingExceptionToMethodSignature();
        //e.readFile();
    }
    void readFile() throws FileNotFoundException {
        read();
    }
    void read() throws FileNotFoundException {
        FileInputStream f = new FileInputStream("File");//Java will provide a default handler to handle the error
    }

}
