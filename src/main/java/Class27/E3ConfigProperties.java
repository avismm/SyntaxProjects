package Class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E3ConfigProperties {
    public static void main(String[] args) throws IOException {


        String url=getProperty("url");
        String userName=getProperty("userName");
        String password=getProperty("password");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        WebElement userNameField= driver.findElement(By.id("txtUsername"));

        //passing the value from the userName variable into the userNameField
        userNameField.sendKeys(userName);

        WebElement passwordField= driver.findElement(By.id("txtPassword"));

        //passing the value from the password variable into the passwordField field
        passwordField.sendKeys(password);

        WebElement loginButton= driver.findElement(By.id("btnLogin"));
        loginButton.click();

    }

    //Declaring a method which will return the property value of the file object. The method takes in an augment
    //which is the variable storing the object property's key.

    public static String getProperty(String propKey) throws IOException{
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";

        //moves the file from permanent storage into the RAM
        FileInputStream fis=new FileInputStream(path);

        //Interacting with the properties of the file. Allows us to read and write data from the file
        Properties properties=new Properties();

        //loads the data from text file stored in the fis object, into the properties object
        properties.load(fis);
        return(properties.getProperty((propKey)));
    }
}
