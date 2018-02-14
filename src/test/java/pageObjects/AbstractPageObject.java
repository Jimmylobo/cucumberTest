package pageObjects;

import driver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.URL;

import static driver.WebDriverSetup.getDriver;

public class AbstractPageObject {
    protected static URL pageUrl;

    public void gotoThisPage() {
        WebDriverSetup.getDriver().get(pageUrl.toString());
        WebDriverSetup.setCurrentPage(this);
    }
}