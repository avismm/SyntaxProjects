package Class29Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E5ExceptionsAddTryCatchBlock {
    public static void main(String[] args) {
        E5ExceptionsAddTryCatchBlock e=new E5ExceptionsAddTryCatchBlock();
        e.readFile();
    }
    void readFile(){
        read();
    }
    void read() {
        try {
            FileInputStream f = new FileInputStream("File");//Java will provide a default handler to handle the error
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
