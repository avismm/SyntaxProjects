package Class20Polymorphism;

import java.io.FileWriter;
import java.io.IOException;

public class E7CreatingFIles {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileWriter f=new FileWriter("test.txt");
        for (int i = 0; i < 5; i++) {
            f.write("Hey guys. How are you all \n");
        }
        f.close();
    }

}
