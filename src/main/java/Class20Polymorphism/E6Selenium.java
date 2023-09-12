package Class20Polymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//You can replace Ctrl + r to replace text within the code
public class E6Selenium {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chrome=new ChromeDriver();
        chrome.manage().window().maximize();
        Thread.sleep(2000);
        chrome.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        chrome.navigate().to("https://facebook.com");
        Thread.sleep(2000);
        chrome.navigate().to("https://google.com");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().back();
        chrome.close();

        EdgeDriver edgeDriver=new EdgeDriver();
        chrome.manage().window().maximize();
        Thread.sleep(2000);
        edgeDriver.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        edgeDriver.navigate().to("https://facebook.com");
        Thread.sleep(2000);
        edgeDriver.navigate().to("https://google.com");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        edgeDriver.navigate().back();
        edgeDriver.close();
    }
}
