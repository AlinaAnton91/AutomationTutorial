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
    @FindBy(css = "span[id='edit-record-4']")
    public WebElement editElement;
    @FindBy(css = "input[placeholder='First Name']")
    public WebElement editFirstNameElement;
    @FindBy(css = "input[placeholder='Last Name']")
    public WebElement editLastNameElement;
    @FindBy(css = "input[placeholder='name@example.com']")
    public WebElement editEmailAddressElement;
    @FindBy(css = "input[placeholder='Age']")
    public WebElement editAgeElement;
    @FindBy(css = "input[placeholder='Salary']")
    public WebElement editSalaryElement;
    @FindBy(css = "input[placeholder='Department']")
    public WebElement editDepartmentElement;
    @FindBy(id = "submit")
    public WebElement editSubmitElement;
    @FindBy(css = "input[placeholder='Type to search']")
    public WebElement searchElement;
    @FindBy(css = "span[id='delete-record-4']")
    public WebElement deleteButtonElement;

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

    public void editNewEntry(String editFirstNameValue, String editLastNameValue, String editEmailAddressValue,
                             String editAgeValue, String editSalaryValue, String editDepartmentValue){
        editElement.click();

        editFirstNameElement.clear();
        editFirstNameElement.sendKeys(editFirstNameValue);

        editLastNameElement.clear();
        editLastNameElement.sendKeys(editLastNameValue);

        editEmailAddressElement.clear();
        editEmailAddressElement.sendKeys(editEmailAddressValue);

        editAgeElement.clear();
        editAgeElement.sendKeys(editAgeValue);

        editSalaryElement.clear();
        editSalaryElement.sendKeys(editSalaryValue);

        editDepartmentElement.clear();
        editDepartmentElement.sendKeys(editDepartmentValue);

        editSubmitElement.click();

    }

    public void deleteNewEntry(String editLastNameValue){
        searchElement.sendKeys(editLastNameValue);
        deleteButtonElement.click();

    }
}
