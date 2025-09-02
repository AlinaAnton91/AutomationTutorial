package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class PracticeFormPage {
    public WebDriver driver;

    public PracticeFormPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    public WebElement firstNameElement;
    @FindBy(id = "lastName")
    public WebElement lastNameElement;
    @FindBy(id = "userEmail")
    public WebElement emailAddressElement;
    @FindBy(css = "div[id='genterWrapper']>div>div>label[class='custom-control-label']")
    public List<WebElement> genderList;
    @FindBy(css = "input[placeholder='Mobile Number']")
    public WebElement mobileElement;
    @FindBy(css = "div[id='hobbiesWrapper']>div>div>label[class='custom-control-label'] ")
    public List<WebElement> hobbyList;
    @FindBy(id = "subjectsInput")
    public WebElement subjectsElement;
    @FindBy(id = "uploadPicture")
    public WebElement pictureElement;
    @FindBy(id = "currentAddress")
    public WebElement currentAddressElement;
    @FindBy(xpath = "//div[text()='Select State']")
    public WebElement stateElement;
    @FindBy(xpath = "//div[text()='Select City']")
    public WebElement cityElement;
    @FindBy(id = "react-select-4-input")
    public WebElement cityInputElement;
    @FindBy(id = "submit")
    public WebElement submitElement;
    @FindBy(id = "example-modal-sizes-title-lg")
    public WebElement thankYouElement;
    @FindBy(xpath = "//tbody/tr")
    public WebElement tableRowsList;
    @FindBy(id = "closeLargeModal")
    public WebElement closeElement;



    //add variables
}
