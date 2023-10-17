package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;

    //method to load the file
    public void openPropFiles(String path) {
        try(FileInputStream fis=new FileInputStream(path);){
            properties=new Properties();
            properties.load(fis);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
//method to read the file. Note: According to industry practice, this method is considered too short.
// As per industry norms, a method should have at least three lines of code
    public String getPropertyValue(String key){
        return properties.getProperty(key);
    }

    public static String getProperty(String propKey) {
        return getProperty(Constants.CONFIG_FILE_PATH,propKey);
       /* String value=null;
        try(FileInputStream fis = new FileInputStream(Constants.CONFIG_FILE_PATH);){

            Properties prop = new Properties();
            prop.load(fis);
            //return the value of the property that we provided in the parameter
            value = prop.getProperty(propKey);
        }catch (IOException e){
            e.printStackTrace();
        }
        return value;*/
    }
/* public static String getProperty(String path, String propKey) throws IOException: This is the method signature,
indicating that it's a public static method that takes two parameters: path (the path to the properties file) and propKey (the property key for which you want to retrieve the value).
It also declares that it can throw an IOException if there's an issue with file I/O.

FileInputStream fis = new FileInputStream(path);: This line creates a FileInputStream to read the properties file specified by the path parameter.
Properties prop = new Properties();: Here, a Properties object is created. This object will be used to load and store the properties from the file.
prop.load(fis);: This line loads the properties from the input stream (the file) into the Properties object.
String value = prop.getProperty(propKey);: Using the getProperty method of the Properties object, it retrieves the value
associated with the propKey provided as a parameter.
return value;: Finally, the method returns the retrieved property value.*/
    public static String getProperty(String path,String propKey) {
        String value=null;
        try{

            FileInputStream fis = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(fis);
            //return the value of the property that we provide in the parameter
            value = prop.getProperty(propKey);
        }catch(IOException e){
            e.printStackTrace();
        }
        return value;
    }

}
