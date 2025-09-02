package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.IndexPage;
import pages.PracticeFormPage;
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

        String firstNameElementValue = "Jeremy";
        String lastNameElementValue = "Wallace";
        String emailAddressElementValue = "jeremy.wallace@demoqa.com";
        String genderValue = "Female";
        String mobileElementValue = "1234567890";
        List<String> hobbyValues = Arrays.asList("Sports", "Reading", "Music");
        List<String> subjectsValue = Arrays.asList("Maths", "Biology", "Chemistry");
        String picturePath = "src/test/resources/Grogu-profile.webp";
        String currentAddressElementValue1 = "21 Baker Street";
        String currentAddressElementValue2 = "London";
        String currentAddressElementValue3 = "SW1 2JD";
        String stateValue = "NCR";
        String cityValue = "Noida";
        String expectedThankYouValue = "Thanks for submitting the form";

        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.fillEntireForm(firstNameElementValue, lastNameElementValue, emailAddressElementValue, genderValue,
                mobileElementValue, hobbyValues, subjectsValue, picturePath, currentAddressElementValue1, currentAddressElementValue2,
                currentAddressElementValue3, stateValue, cityValue, expectedThankYouValue);
        practiceFormPage.validateEntireForm(firstNameElementValue, lastNameElementValue, emailAddressElementValue, genderValue,
                mobileElementValue, hobbyValues, subjectsValue, currentAddressElementValue1, currentAddressElementValue2,
                currentAddressElementValue3, stateValue, cityValue);
    }

}
