package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
    public WebDriver driver;

    public IndexPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    public WebElement alertsFrameWindowsMenu;
    @FindBy(xpath = "//h5[text()='Elements']")
    public WebElement elementsMenu;

    public void interactWithAlertFrameWindowsMenu(){

        alertsFrameWindowsMenu.click();
    }

    public void interactWithElementsMenu(){

        elementsMenu.click();
    }
}
