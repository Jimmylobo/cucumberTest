package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.AbstractPageObject;

public class WebDriverSetup {
    private static WebDriver webDriver;
    private static AbstractPageObject currentPage;

    public static void initDriver() {
        System.setProperty("webdriver.gecko.driver", "lib\\geckodriver.exe");
        webDriver = new FirefoxDriver();
    }

    public static void cleanupDriver() {
        webDriver.quit();
        webDriver = null;
    }

    public static WebDriver getDriver() {
        if (webDriver == null) {
            initDriver();
        }
        return webDriver;
    }

    public static void setCurrentPage(AbstractPageObject pageObject) {
        currentPage = pageObject;
    }

    public static AbstractPageObject getCurrentPage() {
        return currentPage;
    }
}
