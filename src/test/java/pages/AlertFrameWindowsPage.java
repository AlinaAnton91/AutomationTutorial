package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertFrameWindowsPage {
    public WebDriver driver;

    public AlertFrameWindowsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement alertsSubMenu;
    @FindBy(xpath = "//span[text()='Frames']")
    public WebElement framesSubMenu;
    @FindBy(xpath = "//span[text()='Browser Windows']")
    public WebElement browserWindowsSubMenu;


    public void interactWithBrowserWindowsSubMenu() {
        browserWindowsSubMenu.click();
    }

    public void interactWithAlertsSubMenu(){
        alertsSubMenu.click();
    }

    public void interactWithFramesSubMenu() {
        framesSubMenu.click();
    }
}
