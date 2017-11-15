package StepDefs;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginStepDefs {
    private WebDriver webDriver;

    @Given("^browser is opened$")
    public void openBrowser() throws Throwable{
       webDriver = new FirefoxDriver();
    }

    @Given("^(.+) page is opened$")
    public void openPage(String pageName) throws Throwable{
        String url;

        switch(pageName) {
            case "WP mail login": url = "https://poczta.wp.pl/"; break;
            case "inna strona": url = "bla"; break;
            default: throw new AssertionError("Incorrect page name provided: " + pageName);
        }

        webDriver.get(url);
    }
}