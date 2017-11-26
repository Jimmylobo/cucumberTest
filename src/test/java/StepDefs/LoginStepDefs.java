package StepDefs;

import cucumber.api.java.en.Given;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static driver.WebDriverSetup.initDriver;
import static driver.WebDriverSetup.getDriver;

public class LoginStepDefs {

    @Given("^browser is opened$")
    public void openBrowser() throws Throwable{
        initDriver();
    }

    @Given("^(.+) page is opened$")
    public void openPage(String pageName) throws Throwable{
        String url;

        switch(pageName) {
            case "WP mail login": url = "https://poczta.wp.pl/"; break;
            case "inna strona": url = "bla"; break;
            default: throw new AssertionError("Incorrect page name provided: " + pageName);
        }

        getDriver().get(url);
    }
}