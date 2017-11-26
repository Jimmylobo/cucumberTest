package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

import static driver.WebDriverSetup.getDriver;

public class LoginPage extends AbstractPageObject {
    private static WebElement loginInput;
    private static WebElement passwordInput;
    private static WebElement zalogujButton;

    private static By loginInputLocator = By.id("login");
    private static By passwordInputLocator = By.id("password");
    private static By zalogujButtonLocator = By.id("btnSubmit");

    public LoginPage() {
        try {
            pageUrl = new URL("https://poczta.wp.pl/");
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException: message" + e.getMessage() + "\nCause: " + e.getCause());
        }
    }

    public static void typeLogin(String value) {
        loginInput = initElement(loginInput, loginInputLocator);
        loginInput.sendKeys(value);
    }

    public static void typePassword(String value) {
        passwordInput = initElement(passwordInput, passwordInputLocator);
        passwordInput.sendKeys(value);
    }

    public static void clickSubmit() {
        zalogujButton = initElement(zalogujButton, zalogujButtonLocator);
        zalogujButton.click();
    }
}
