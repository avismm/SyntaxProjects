package ReviewClass11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E2Config {
    public static void main(String[] args) {
        String path="C:\\Users\\LENOVO\\IdeaProjects\\SyntaxProjects\\Files\\Config.properties";

        //Note: only classes that implement the closable interface can be placed inside this try block
        try(FileInputStream fis=new FileInputStream(path)){
            ;
            Properties properties=new Properties();
            properties.load(fis);
            System.out.println(properties.getProperty("browser"));

            //THe IOException will be able to handle the FileNotFound exception as well as the input/output errors
        }catch (IOException io){
            //Here, you can provide a simple-to-understand error message or, you could also send an email
            //You can also have a backup code to create a new file if the one from the above path is not found.
            System.out.println("The file was not found. Please check the file you are trying to read");
        }

        //finally block makes sure the code we are putting there is always executing. However,
        //we can use the try catch with resources and java will handle the "finally" block for us automatically
        /*finally {
            try{
                fis.close();
            }catch (IOException e){
                System.out.println("The file could not be closed. Please check that the file exists");
            }

        }   */
    }
}
