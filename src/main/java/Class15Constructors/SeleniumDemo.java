package Class15Constructors;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chrome =new ChromeDriver();
        chrome.navigate().to("https://google.com");
        Thread.sleep(10000);
        chrome.navigate().to("https://amazon.com");
        chrome.navigate().refresh();
        Thread.sleep(5000);
        chrome.close();

    }
}
