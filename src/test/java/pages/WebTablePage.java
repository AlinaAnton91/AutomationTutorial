package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage extends BasePage {

    public WebTablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "addNewRecordButton")
    private WebElement addElement;
    @FindBy(id = "firstName")
    private WebElement firstNameElement;
    @FindBy(id = "lastName")
    private WebElement lastNameElement;
    @FindBy(id = "userEmail")
    private WebElement userEmailElement;
    @FindBy(id = "age")
    private WebElement ageElement;
    @FindBy(id = "salary")
    private WebElement salaryElement;
    @FindBy(id = "department")
    private WebElement departmentElement;
    @FindBy(id = "submit")
    private WebElement submitElement;
    @FindBy(css = "span[id='edit-record-4']")
    private WebElement editElement;
    @FindBy(css = "input[placeholder='First Name']")
    private WebElement editFirstNameElement;
    @FindBy(css = "input[placeholder='Last Name']")
    private WebElement editLastNameElement;
    @FindBy(css = "input[placeholder='name@example.com']")
    private WebElement editEmailAddressElement;
    @FindBy(css = "input[placeholder='Age']")
    private WebElement editAgeElement;
    @FindBy(css = "input[placeholder='Salary']")
    private WebElement editSalaryElement;
    @FindBy(css = "input[placeholder='Department']")
    private WebElement editDepartmentElement;
    @FindBy(id = "submit")
    private WebElement editSubmitElement;
    @FindBy(css = "input[placeholder='Type to search']")
    private WebElement searchElement;
    @FindBy(css = "span[id='delete-record-4']")
    private WebElement deleteButtonElement;

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
