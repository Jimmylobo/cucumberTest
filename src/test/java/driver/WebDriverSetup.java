package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSetup {
    private static WebDriver webDriver;

    public static void initDriver() {
        System.setProperty("webdriver.gecko.driver", "lib\\geckodriver.exe");
        webDriver = new FirefoxDriver();
    }

    public static WebDriver getDriver() {
        return webDriver;
    }
}
