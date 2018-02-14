package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MailboxPage extends AbstractPageObject  {

    private final By ALL_FOLDERS_LIST_LOCATOR = By.cssSelector("div.foldersList a.gwt-Anchor");
    List<WebElement> getAllFoldersListWebElements(){

    }



}
