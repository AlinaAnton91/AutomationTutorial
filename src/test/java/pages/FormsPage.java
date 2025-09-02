package pages;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FormsPage {
    public WebDriver driver;

    public FormsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    public WebElement practiceFormSubMenu;

    public void interactWithPracticeFormSubMenu(){
        practiceFormSubMenu.click();
        LoggerUtility.info("The user clicks on practiceFormSubMenu");
    }
}
