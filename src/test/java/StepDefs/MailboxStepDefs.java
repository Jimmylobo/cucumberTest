package StepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dictionaries.FolderDictionary;
import org.junit.Assert;
import pageObjects.MailboxPage;

public class MailboxStepDefs implements FolderDictionary {

    @When("Folder \"(.+)\" is bold")
    public void checkIfFolderIsBold(String folderName) {
        Assert.assertTrue(new MailboxPage().isFolderLinkBold(folderName));
    }

    @Then("Folders other than \"(.+)\" are not bold")
    public void checkIfFoldersOtherThanSpecifiedAreNotBold(String folderName) {
        Assert.assertTrue(new MailboxPage().areFolderLinksOtherThanSpecifiedNotBold(folderName));
    }
}