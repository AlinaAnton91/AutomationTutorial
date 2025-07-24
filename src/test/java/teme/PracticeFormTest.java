package teme;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticeFormTest {

    public WebDriver driver;

    @Test
    public void metodaTest() {

        //Deschidem un browser
        driver = new ChromeDriver();

        //Accesam un URL
        driver.get("https://demoqa.com/automation-practice-form");

        //Maximizam fereastra
        driver.manage().window().maximize();

        WebElement firstNameElement = driver.findElement(By.id("firstName"));
        String firstNameElementValue = "Jeremy";
        firstNameElement.sendKeys(firstNameElementValue);

        WebElement lastNameElement = driver.findElement(By.id("lastName"));
        String lastNameElementValue = "Wallace";
        lastNameElement.sendKeys(lastNameElementValue);

        WebElement emailAddressElement = driver.findElement(By.id("userEmail"));
        String emailAddressElementValue = "jeremy.wallace@demoqa.com";
        emailAddressElement.sendKeys(emailAddressElementValue);

        WebElement genderElement = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
        genderElement.click();

        WebElement mobileElement = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String mobileElementValue = "123456789";
        mobileElement.sendKeys(mobileElementValue);

        //WebElement subjectsElement = driver.findElement(By.id("subjectsContainer"));
        //String subjectsElementValue = "Math, Biology, Chemistry";
        //subjectsElement.sendKeys(subjectsElementValue);

        WebElement hobbiesElement = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
        hobbiesElement.click();

        WebElement currentAddressElement = driver.findElement(By.id("currentAddress"));
        String currentAddressElementValue1 = "21 Baker Street";
        String currentAddressElementValue2 = "London";
        String currentAddressElementValue3 = "SW1 2JD";

        currentAddressElement.sendKeys(currentAddressElementValue1);
        currentAddressElement.sendKeys(Keys.ENTER);

        currentAddressElement.sendKeys(currentAddressElementValue2);
        currentAddressElement.sendKeys(Keys.ENTER);

        currentAddressElement.sendKeys(currentAddressElementValue3);

    }

}
