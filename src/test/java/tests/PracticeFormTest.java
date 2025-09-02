package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.IndexPage;
import sharedData.SharedData;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PracticeFormTest extends SharedData {

    @Test
    public void metodaTest() {

        IndexPage indexpage = new IndexPage(driver);
        indexpage.interactWithFormsMenu();

        FormsPage formsPage = new FormsPage(driver);
        formsPage.interactWithPracticeFormSubMenu();


//        WebElement formsMenu = driver.findElement(By.xpath("//h5[text()='Forms']"));
//        formsMenu.click();
//
//        WebElement practiceFormSubMenu = driver.findElement(By.xpath("//span[text()='Practice Form']"));
//        practiceFormSubMenu.click();
//
//        WebElement firstNameElement = driver.findElement(By.id("firstName"));
//        String firstNameElementValue = "Jeremy";
//        firstNameElement.sendKeys(firstNameElementValue);
//
//        WebElement lastNameElement = driver.findElement(By.id("lastName"));
//        String lastNameElementValue = "Wallace";
//        lastNameElement.sendKeys(lastNameElementValue);
//
//        WebElement emailAddressElement = driver.findElement(By.id("userEmail"));
//        String emailAddressElementValue = "jeremy.wallace@demoqa.com";
//        emailAddressElement.sendKeys(emailAddressElementValue);
//
//        //WebElement genderElement = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
//        //genderElement.click();
//
//        String genderValue = "Female";
//        List<WebElement> genderList = driver.findElements(By.cssSelector("div[id='genterWrapper']>div>div>label[class='custom-control-label']"));
//        switch (genderValue) {
//            case "Male":
//                genderList.get(0).click();
//                break;
//            case "Female":
//                genderList.get(1).click();
//                break;
//            case "Other":
//                genderList.get(2).click();
//                break;
//        }
//
//
//        WebElement mobileElement = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
//        String mobileElementValue = "1234567890";
//        mobileElement.sendKeys(mobileElementValue);
//
//
//        List<WebElement> hobbyList = driver.findElements(By.cssSelector("div[id='hobbiesWrapper']>div>div>label[class='custom-control-label'] "));
//        List<String> hobbyValues = Arrays.asList("Sports", "Reading", "Music");
//        //Alternativa clasica:
//        //List<String> hobbyValues = new ArrayList<>();
//        //hobbyValues.add("Reading");
//        //hobbyValues.add("Music");
//
//        //parcurgem lista de elemente
//        for (int index = 0; index < hobbyList.size(); index++) {
//            //extragem textul de pe elementul curent
//            String currentText = hobbyList.get(index).getText();
//            if (hobbyValues.contains(currentText)) {
//                hobbyList.get(index).click();
//            }
//
//        }
//
//        WebElement subjectsElement = driver.findElement(By.id("subjectsInput"));
//        List<String> subjectsValue = Arrays.asList("Maths", "Biology", "Chemistry");
//        int contor = 0;
//        while (contor < subjectsValue.size()) {
//            subjectsElement.sendKeys(subjectsValue.get(contor));
//            try {
//                Thread.sleep(250);
//            } catch (InterruptedException e) {
//
//            }
//            subjectsElement.sendKeys(Keys.ENTER);
//            try {
//                Thread.sleep(250);
//            } catch (InterruptedException e) {
//
//            }
//            contor++;
//        }
//
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,400)", "");
//
//
//        WebElement pictureElement = driver.findElement(By.id("uploadPicture"));
//        String picturePath = "src/test/resources/Grogu-profile.webp";
//
//        File pictureFile = new File(picturePath);
//        pictureElement.sendKeys(pictureFile.getAbsolutePath());
//
//        WebElement currentAddressElement = driver.findElement(By.id("currentAddress"));
//        String currentAddressElementValue1 = "21 Baker Street";
//        String currentAddressElementValue2 = "London";
//        String currentAddressElementValue3 = "SW1 2JD";
//
//        currentAddressElement.sendKeys(currentAddressElementValue1);
//        currentAddressElement.sendKeys(Keys.ENTER);
//
//        currentAddressElement.sendKeys(currentAddressElementValue2);
//        currentAddressElement.sendKeys(Keys.ENTER);
//
//        currentAddressElement.sendKeys(currentAddressElementValue3);
//
//        WebElement stateElement = driver.findElement(By.xpath("//div[text()='Select State']"));
//        stateElement.click();
//        WebElement stateInputElement = driver.findElement(By.id("react-select-3-input"));
//        String stateValue = "NCR";
//        stateInputElement.sendKeys(stateValue);
//        stateInputElement.sendKeys(Keys.ENTER);
//
//        WebElement cityElement = driver.findElement(By.xpath("//div[text()='Select City']"));
//        cityElement.click();
//        WebElement cityInputElement = driver.findElement(By.id("react-select-4-input"));
//        String cityValue = "Noida";
//        cityInputElement.sendKeys(cityValue);
//        cityInputElement.sendKeys(Keys.ENTER);
//
//        WebElement submitElement = driver.findElement(By.id("submit"));
//        submitElement.click();
//
//        WebElement thankYouElement = driver.findElement(By.id("example-modal-sizes-title-lg"));
//        String expectedThankYouValue = "Thanks for submitting the form";
//        String actualThankYouValue = thankYouElement.getText();
//        Assert.assertEquals(actualThankYouValue, expectedThankYouValue, "Thank you message from confirmation is not displayed right");
//
//        List<WebElement> tableRowsList = driver.findElements(By.xpath("//tbody/tr"));
//        Assert.assertTrue(tableRowsList.get(0).getText().contains("Student Name"));
//        Assert.assertTrue(tableRowsList.get(0).getText().contains(firstNameElementValue));
//        Assert.assertTrue(tableRowsList.get(0).getText().contains(lastNameElementValue));
//
//        Assert.assertTrue(tableRowsList.get(1).getText().contains("Student Email"));
//        Assert.assertTrue(tableRowsList.get(1).getText().contains(emailAddressElementValue));
//
//        Assert.assertTrue(tableRowsList.get(2).getText().contains("Gender"));
//        Assert.assertTrue(tableRowsList.get(2).getText().contains(genderValue));
//
//        Assert.assertTrue(tableRowsList.get(3).getText().contains("Mobile"));
//        Assert.assertTrue(tableRowsList.get(3).getText().contains(mobileElementValue));
//
//        Assert.assertTrue(tableRowsList.get(5).getText().contains("Subjects"));
//        Assert.assertTrue(tableRowsList.get(5).getText().contains(String.join(", ", subjectsValue)));
//
//        Assert.assertTrue(tableRowsList.get(6).getText().contains("Hobbies"));
//        Assert.assertTrue(tableRowsList.get(6).getText().contains(String.join(", ", hobbyValues)));
//
//        Assert.assertTrue(tableRowsList.get(8).getText().contains("Address"));
//        Assert.assertTrue(tableRowsList.get(8).getText().contains(currentAddressElementValue1));
//        Assert.assertTrue(tableRowsList.get(8).getText().contains(currentAddressElementValue2));
//        Assert.assertTrue(tableRowsList.get(8).getText().contains(currentAddressElementValue3));
//
//        Assert.assertTrue(tableRowsList.get(9).getText().contains("State and City"));
//        Assert.assertTrue(tableRowsList.get(9).getText().contains(stateValue));
//        Assert.assertTrue(tableRowsList.get(9).getText().contains(cityValue));
//
//
//        WebElement closeElement = driver.findElement(By.id("closeLargeModal"));
//        closeElement.click();
//
    }

}
