package Class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2ConfigProperties {
    public static void main(String[] args) {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String userName="Admin";
        String password="HfdftTT";
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement userNameField= driver.findElement(By.id("txtUsername"));

        //passing the value from the userName variable into the userNameFiield
        userNameField.sendKeys(userName);

        WebElement passwordField= driver.findElement(By.id("txtPassword"));

        //passing the value from the password variable into the passwordField field
        userNameField.sendKeys(password);

        WebElement loginButton= driver.findElement(By.id("btnLogin"));
        loginButton.click();
    }
}
