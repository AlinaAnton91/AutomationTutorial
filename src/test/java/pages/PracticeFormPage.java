package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.io.File;
import java.util.List;

public class PracticeFormPage extends BasePage {

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstName")
    private WebElement firstNameElement;
    @FindBy(id = "lastName")
    private WebElement lastNameElement;
    @FindBy(id = "userEmail")
    private WebElement emailAddressElement;
    @FindBy(css = "div[id='genterWrapper']>div>div>label[class='custom-control-label']")
    private List<WebElement> genderList;
    @FindBy(css = "input[placeholder='Mobile Number']")
    private WebElement mobileElement;
    @FindBy(css = "div[id='hobbiesWrapper']>div>div>label[class='custom-control-label'] ")
    private List<WebElement> hobbyList;
    @FindBy(id = "subjectsInput")
    private WebElement subjectsElement;
    @FindBy(id = "uploadPicture")
    private WebElement pictureElement;
    @FindBy(id = "currentAddress")
    private WebElement currentAddressElement;
    @FindBy(xpath = "//div[text()='Select State']")
    private WebElement stateElement;
    @FindBy(xpath = "//div[text()='Select City']")
    private WebElement cityElement;
    @FindBy(id = "react-select-4-input")
    private WebElement cityInputElement;
    @FindBy(id = "react-select-3-input")
    private WebElement stateInputElement;
    @FindBy(id = "submit")
    private WebElement submitElement;
    @FindBy(id = "example-modal-sizes-title-lg")
    private WebElement thankYouElement;
    @FindBy(xpath = "//tbody/tr")
    private List<WebElement> tableRowsList;
    @FindBy(id = "closeLargeModal")
    private WebElement closeElement;



    public void fillEntireForm(String firstNameElementValue, String lastNameElementValue, String emailAddressElementValue,
                               String genderValue, String mobileElementValue, List<String> hobbyValues, List<String> subjectsValue,
                               String picturePath, String currentAddressElementValue1, String currentAddressElementValue2,
                               String currentAddressElementValue3, String stateValue, String cityValue, String expectedThankYouValue){
        firstNameElement.sendKeys(firstNameElementValue);
        lastNameElement.sendKeys(lastNameElementValue);
        emailAddressElement.sendKeys(emailAddressElementValue);

        switch (genderValue) {
            case "Male":
                genderList.get(0).click();
                break;
            case "Female":
                genderList.get(1).click();
                break;
            case "Other":
                genderList.get(2).click();
                break;
        }

        mobileElement.sendKeys(mobileElementValue);


        //Alternativa clasica:
        //List<String> hobbyValues = new ArrayList<>();
        //hobbyValues.add("Reading");
        //hobbyValues.add("Music");

        //parcurgem lista de elemente
        for (int index = 0; index < hobbyList.size(); index++) {
            //extragem textul de pe elementul curent
            String currentText = hobbyList.get(index).getText();
            if (hobbyValues.contains(currentText)) {
                hobbyList.get(index).click();
            }

        }

        int contor = 0;
        while (contor < subjectsValue.size()) {
            subjectsElement.sendKeys(subjectsValue.get(contor));
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {

            }
            subjectsElement.sendKeys(Keys.ENTER);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {

            }
            contor++;
        }


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");

        File pictureFile = new File(picturePath);
        pictureElement.sendKeys(pictureFile.getAbsolutePath());


        currentAddressElement.sendKeys(currentAddressElementValue1);
        currentAddressElement.sendKeys(Keys.ENTER);

        currentAddressElement.sendKeys(currentAddressElementValue2);
        currentAddressElement.sendKeys(Keys.ENTER);

        currentAddressElement.sendKeys(currentAddressElementValue3);

        stateElement.click();
        stateInputElement.sendKeys(stateValue);
        stateInputElement.sendKeys(Keys.ENTER);

        cityElement.click();
        cityInputElement.sendKeys(cityValue);
        cityInputElement.sendKeys(Keys.ENTER);

        submitElement.click();

        String actualThankYouValue = thankYouElement.getText();
        Assert.assertEquals(actualThankYouValue, expectedThankYouValue, "Thank you message from confirmation is not displayed right");
    }

    public void validateEntireForm(String firstNameElementValue, String lastNameElementValue, String emailAddressElementValue,
                                   String genderValue, String mobileElementValue, List<String> hobbyValues, List<String> subjectsValue,
                                   String currentAddressElementValue1, String currentAddressElementValue2,
                                   String currentAddressElementValue3, String stateValue, String cityValue){
        Assert.assertTrue(tableRowsList.get(0).getText().contains("Student Name"));
        Assert.assertTrue(tableRowsList.get(0).getText().contains(firstNameElementValue));
        Assert.assertTrue(tableRowsList.get(0).getText().contains(lastNameElementValue));

        Assert.assertTrue(tableRowsList.get(1).getText().contains("Student Email"));
        Assert.assertTrue(tableRowsList.get(1).getText().contains(emailAddressElementValue));

        Assert.assertTrue(tableRowsList.get(2).getText().contains("Gender"));
        Assert.assertTrue(tableRowsList.get(2).getText().contains(genderValue));

        Assert.assertTrue(tableRowsList.get(3).getText().contains("Mobile"));
        Assert.assertTrue(tableRowsList.get(3).getText().contains(mobileElementValue));

        Assert.assertTrue(tableRowsList.get(5).getText().contains("Subjects"));
        Assert.assertTrue(tableRowsList.get(5).getText().contains(String.join(", ", subjectsValue)));

        Assert.assertTrue(tableRowsList.get(6).getText().contains("Hobbies"));
        Assert.assertTrue(tableRowsList.get(6).getText().contains(String.join(", ", hobbyValues)));

        Assert.assertTrue(tableRowsList.get(8).getText().contains("Address"));
        Assert.assertTrue(tableRowsList.get(8).getText().contains(currentAddressElementValue1));
        Assert.assertTrue(tableRowsList.get(8).getText().contains(currentAddressElementValue2));
        Assert.assertTrue(tableRowsList.get(8).getText().contains(currentAddressElementValue3));

        Assert.assertTrue(tableRowsList.get(9).getText().contains("State and City"));
        Assert.assertTrue(tableRowsList.get(9).getText().contains(stateValue));
        Assert.assertTrue(tableRowsList.get(9).getText().contains(cityValue));

        closeElement.click();
    }
}
