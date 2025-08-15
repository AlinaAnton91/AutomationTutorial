package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {
    public WebDriver driver;

    public WebTablePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "addNewRecordButton")
    public WebElement addElement;
    @FindBy(id = "firstName")
    public WebElement firstNameElement;
    @FindBy(id = "lastName")
    public WebElement lastNameElement;
    @FindBy(id = "userEmail")
    public WebElement userEmailElement;
    @FindBy(id = "age")
    public WebElement ageElement;
    @FindBy(id = "salary")
    public WebElement salaryElement;
    @FindBy(id = "department")
    public WebElement departmentElement;
    @FindBy(id = "submit")
    public WebElement submitElement;

    public void addNewEntry(String firstNameValue, String lastNameValue, String userEmailValue,
                            String ageElementValue, String salaryElementValue, String departmentElementValue){
        addElement.click();

        firstNameElement.sendKeys(firstNameValue);
        lastNameElement.sendKeys(lastNameValue);
        userEmailElement.sendKeys(userEmailValue);
        ageElement.sendKeys(ageElementValue);
        salaryElement.sendKeys(salaryElementValue);
        departmentElement.sendKeys(departmentElementValue);

        submitElement.click();
    }

    public void editNewEntry(){

    }

    public void deleteNewEntry(){

    }
}
