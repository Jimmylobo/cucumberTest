package pageObjects;

import driver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import utils.WebElementUtil;

import java.util.List;

public class MailboxPage extends AbstractPageObject  {

    private final By ALL_FOLDERS_LIST_LOCATOR = By.cssSelector("div.foldersList a.gwt-Anchor");


    public boolean areFolderLinksOtherThanSpecifiedNotBold(String folderName) {
        List<WebElement> folderLinksElements = getAllFoldersListWebElements();

        for (WebElement folderLinkElement: folderLinksElements) {
            if (folderLinkElement.getText().equals(folderName)) {
                folderLinksElements.remove(folderLinkElement);
                break;
            }
        }
        //TODO: try lambda expression instead
        boolean areAllNotBold = true;
        boolean isCurrentLinkBold;
        for (WebElement folderLinkElement: folderLinksElements) {
            isCurrentLinkBold = isFolderLinkBold(folderLinkElement.getText());

            if (isCurrentLinkBold) {
                areAllNotBold = false;
                break;
            }
        }

        return areAllNotBold;
    }

    public boolean isFolderLinkBold(String folderName) {
        By locator = getBoldedFolderLocator(folderName);
        List<WebElement> boldFolderElements = WebDriverSetup.getDriver().findElements(locator);

        return boldFolderElements.size() > 0;
    }

    private List<WebElement> getAllFoldersListWebElements(){
        return WebElementUtil.initElements(ALL_FOLDERS_LIST_LOCATOR);
    }


    private By getBoldedFolderLocator(String folderName) {
        return By.xpath("//a[contains(text(),'"+ folderName +"')]/ancestor::table[contains(@class,'boldTxt')]");
    }
}