package Class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {

        //locating the file

       // String path = "C:\\Users\\LENOVO\\IdeaProjects\\SyntaxProjects\\Files\\Config.properties";

        //another way to declare the path of the file on my computer
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
        System.out.println(path);

        //moves the file from permanent storage into the RAM
        FileInputStream fis=new FileInputStream(path);

        //Interacting with the properties of the file. Allows us to read and write data from the file
        Properties properties=new Properties();

        //loads the data from text file stored in the fix object, into the properties object
        properties.load(fis);

        System.out.println(properties.get("userName"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("url"));

        //getting the path of your intellij on my computer where your file is stored.
        System.out.println(System.getProperty("user.dir"));

    }

}
