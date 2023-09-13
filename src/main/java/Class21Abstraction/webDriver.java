package Class21Abstraction;

public abstract class webDriver {
    abstract void openBrowser();
    abstract void loadUrl(String url);
    abstract void performTesting();
    abstract void closeBrowser();
}
class ChromeDriver extends webDriver{

    @Override
    void openBrowser() {
        System.out.println("Open browser");
    }

    @Override
    void loadUrl(String url) {
        System.out.println("opening the url "+url);
    }

    @Override
    void performTesting() {
       System.out.println("perform testing");
    }

    @Override
    void closeBrowser() {
        System.out.println("close browser");
    }
}
class EdgeDriver extends webDriver{

    @Override
    void openBrowser() {
        System.out.println("Open browser");
    }

    @Override
    void loadUrl(String url) {
        System.out.println("opening the url "+url);
    }

    @Override
    void performTesting() {
       System.out.println("perform testing");
    }

    @Override
    void closeBrowser() {
        System.out.println("close browser");
    }
}
