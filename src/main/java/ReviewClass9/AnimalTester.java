package ReviewClass9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AnimalTester {
    public static void main(String[] args) {

        //We can use type casting between parent and child class.
        //When storing the objects of cat and dog in the parant class, it is called
        //implicit type casting.
        AnimalPolymorphism[] a= {new Cat(), new Dog()};
        for(AnimalPolymorphism c:a){
            c.eat();
            c.speak();
        }

        WebDriver[] browsers = {new ChromeDriver(), new EdgeDriver(), new FirefoxDriver()};
        //Using the enhanced for loop
        for(WebDriver w:browsers){
            w.get("https://amazon.com");
            w.manage().window().maximize();
            System.out.println(w.getTitle());
        }
//Using the standard for loop
        for (int i = 0; i < browsers.length; i++) {
            WebDriver b=browsers[i];
            b.get("https://amazon.com");
            b.manage().window().maximize();
            System.out.println(b.getTitle());
            b.close();
        }
    }
}
