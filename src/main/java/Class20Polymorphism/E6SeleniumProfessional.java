package Class20Polymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//You can replace Ctrl + r to replace text within the code
public class E6SeleniumProfessional {
    public static void main(String[] args) throws InterruptedException {
        WebDriver[] arr={new ChromeDriver(), new EdgeDriver()};
        for(WebDriver d:arr){
            d.manage().window().maximize();
            Thread.sleep(2000);
            d.navigate().to("https://amazon.com");
            Thread.sleep(2000);
            d.navigate().to("https://facebook.com");
            Thread.sleep(2000);
            d.navigate().to("https://google.com");
            System.out.println(d.getTitle());
            Thread.sleep(2000);
            d.navigate().back();
            d.close();
        }
    }
}
