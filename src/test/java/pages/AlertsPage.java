package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "alertButton")
    public WebElement alertOkElement;
    @FindBy(id = "confirmButton")
    public WebElement alertConfirmElement;
    @FindBy(id = "promtButton")
    public WebElement alertPromptElement;

    public void dealWithAlertOk(){
        alertOkElement.click();
        LoggerUtility.info("The user clicks on Alert with OK");

        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();
        LoggerUtility.info("The user accepts the alert");

    }

    public void dealWithAlertCancel(){
        alertConfirmElement.click();
        LoggerUtility.info("The user clicks on Alert with cancel");

        Alert alertConfirm = driver.switchTo().alert();
        alertConfirm.dismiss();
        LoggerUtility.info("The user dismisses the alert");
    }

    public void dealWithAlertValue(String value) {
        alertPromptElement.click();
        LoggerUtility.info("The user clicks on Alert with Prompt");

        Alert alertPrompt = driver.switchTo().alert();
        alertPrompt.sendKeys(value);
        alertPrompt.accept();
        LoggerUtility.info("The user fills the alert with a value: " + value);
    }
}
