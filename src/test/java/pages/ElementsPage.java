package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {
    public WebDriver driver;

    public ElementsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Web Tables']")
    public WebElement webTablesDubMenu;

    public void interactWithWebTableSubMenu(){
        webTablesDubMenu.click();
    }
}
