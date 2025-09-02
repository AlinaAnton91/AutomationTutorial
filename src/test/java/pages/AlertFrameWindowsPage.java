package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertFrameWindowsPage extends BasePage {

    public AlertFrameWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement alertsSubMenu;
    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement framesSubMenu;
    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement browserWindowsSubMenu;


    public void interactWithBrowserWindowsSubMenu() {
        browserWindowsSubMenu.click();
        LoggerUtility.info("The user clicks on the Browser Window SubMenu");
    }

    public void interactWithAlertsSubMenu(){
        alertsSubMenu.click();
        LoggerUtility.info("The user clicks on the Alerts SubMenu");
    }

    public void interactWithFramesSubMenu() {
        framesSubMenu.click();
        LoggerUtility.info("The user clicks on the Frames SubMenu");
    }
}
