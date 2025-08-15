package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertWindowFramePage {
    public WebDriver driver;

    public AlertWindowFramePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement alertsSubMenu;

    public void interactWithAlertsSubMenu(){
        alertsSubMenu.click();
    }
}
