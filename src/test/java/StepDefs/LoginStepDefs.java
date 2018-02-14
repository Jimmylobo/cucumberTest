package StepDefs;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


import pageObjects.LoginPage;

import static driver.WebDriverSetup.initDriver;
import static driver.WebDriverSetup.cleanupDriver;
import static driver.WebDriverSetup.getCurrentPage;

public class LoginStepDefs {

    private final String LOGIN_FIELD_NAME = "login lub email"
    private final String PASSWORD_FIELD_NAME = "hasło"

    @After
    public void cleanUp() {
        //TODO (Jimmy): zrobić, żeby działało
        cleanupDriver();
    }

    @Given("^browser is opened$")
    public void openBrowser() throws Throwable {
        initDriver();
    }

    @Given("^WP mail login page is opened$")
    public void openLoginPage() throws Throwable {
        new LoginPage().gotoThisPage();
    }

    @When("^\"(.+)\" field is populated with \"(.+)\"$")
    public void fillInputField(String field, String value) {
        assert getCurrentPage() instanceof LoginPage;

        if (field.equals(LOGIN_FIELD_NAME)) {
            LoginPage.typeLogin(value);
        } else if (field.equals(PASSWORD_FIELD_NAME)) {
            LoginPage.typePassword(value);
        }
    }

    @When("^button \"Zaloguj\" is clicked$")
    public void clickZaloguj() {
        LoginPage.clickSubmit();
    }

    @When("ziutek is logged in")
    public void ziutekLoggedIn() throws Throwable {

        final String LOGIN_FIELD_VALUE = "ziutek2137";
        final String PASSWORD_FIELD_VALUE = "qweasd123";

        LoginStepDefs ziutek = new LoginStepDefs();
        ziutek.openBrowser();
        ziutek.openLoginPage();
        ziutek.fillInputField(LOGIN_FIELD_NAME,LOGIN_FIELD_VALUE);
        ziutek.fillInputField(PASSWORD_FIELD_NAME,PASSWORD_FIELD_VALUE);
        ziutek.clickZaloguj();

    }

    @When("Folder \"Odebrane\" is bold") {

    }

}