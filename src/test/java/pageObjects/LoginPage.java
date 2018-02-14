package pageObjects;

import org.openqa.selenium.By;
import utils.WebElementUtil;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginPage extends AbstractPageObject {

    private static By loginInputSelector = By.id("login");
    private static By passwordInputSelector = By.id("password");
    private static By zalogujButtonLocator = By.id("btnSubmit");

    public LoginPage() {
        try {
            pageUrl = new URL("https://poczta.wp.pl/");
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException: message" + e.getMessage() + "\nCause: " + e.getCause());
        }
    }

    public static void typeLogin(String value) {
        WebElementUtil.initElement(loginInputSelector).sendKeys(value);
    }

    public static void typePassword(String value) {
       WebElementUtil.initElement(passwordInputSelector).sendKeys(value);
    }

    public static void clickSubmit() {
        WebElementUtil.initElement(zalogujButtonLocator).click();
    }
}
