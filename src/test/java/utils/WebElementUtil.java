package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static driver.WebDriverSetup.getDriver;

public class WebElementUtil {
    public static WebElement initElement(By locator) {
       return getDriver().findElement(locator);
    }

    public static List<WebElement> initElements(By locator) {
        return getDriver().findElements(locator);
    }
}
