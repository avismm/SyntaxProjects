package Class21Abstraction;

public class webTester {
    public static void main(String[] args) {
        webDriver[] arr={new ChromeDriver(),new EdgeDriver()};

        for(webDriver w:arr){
            w.openBrowser();
            w.loadUrl("amazon.com");
            w.performTesting();
            w.closeBrowser();

        }

    }

}
