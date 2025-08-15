package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {
    public WebDriver driver;

    public AlertsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "alertButton")
    public WebElement alertOkElement;
    @FindBy(id = "confirmButton")
    public WebElement alertConfirmElement;
    @FindBy(id = "promtButton")
    public WebElement alertPromptElement;

    public void dealWithAlertOk(){
        alertOkElement.click();
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();
    }

    public void dealWithAlertCancel(){
        alertConfirmElement.click();
        Alert alertConfirm = driver.switchTo().alert();
        alertConfirm.dismiss();
    }

    public void dealWithAlertValue(String value) {
        alertPromptElement.click();
        Alert alertPrompt = driver.switchTo().alert();
        alertPrompt.sendKeys(value);
        alertPrompt.accept();
    }
}
