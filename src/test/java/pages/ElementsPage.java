package pages;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage extends BasePage {

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement webTablesDubMenu;

    public void interactWithWebTableSubMenu(){
        webTablesDubMenu.click();
        LoggerUtility.info("The user clicks on webTablesSubMenu");
    }
}
