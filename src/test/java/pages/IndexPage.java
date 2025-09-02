package pages;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage{

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertsFrameWindowsMenu;
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elementsMenu;
    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement formsMenu;

    public void interactWithAlertFrameWindowsMenu(){
        alertsFrameWindowsMenu.click();
        LoggerUtility.info("The user clicks on alertFrameWindowMenu");
    }

    public void interactWithElementsMenu(){
        elementsMenu.click();
        LoggerUtility.info("The user clicks on the Elements Menu");
    }

    public void interactWithFormsMenu(){
        formsMenu.click();
        LoggerUtility.info("The user clicks on the Forms Menu");
    }
}
