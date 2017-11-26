package StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.AfterClass;
import pageObjects.LoginPage;

import static driver.WebDriverSetup.initDriver;
import static driver.WebDriverSetup.cleanupDriver;
import static driver.WebDriverSetup.getCurrentPage;

public class LoginStepDefs {

    @AfterClass
    public void cleanUp() {
        //TODO: zrobić, żeby działało
        cleanupDriver();
    }

    @Given("^browser is opened$")
    public void openBrowser() throws Throwable {
        initDriver();
    }

    @Given("^WP mail login page is opened$")
    public void openPage() throws Throwable {
        new LoginPage().gotoThisPage();
    }

    @When("^\"(.+)\" field is populated with \"(.+)\"$")
    public void fillInputField(String field, String value) {
        assert getCurrentPage() instanceof LoginPage;

        if (field.equals("login lub email")) {
            LoginPage.typeLogin(value);
        } else if (field.equals("hasło")) {
            LoginPage.typePassword(value);
        }
    }

    @When("^button \"(.+)\" is clicked$")
    public void clickZaloguj(String label) {
        assert getCurrentPage() instanceof LoginPage;

        if (label.equals("Zaloguj")) {
            LoginPage.clickSubmit();
        }
    }
}