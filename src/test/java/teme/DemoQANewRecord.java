package teme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoQANewRecord {
    public WebDriver driver;

    @Test
    public void metodaTest() {

        driver=new ChromeDriver();

        driver.get("https://demoqa.com/webtables");

        driver.manage().window().maximize();

        WebElement addElement=driver.findElement(By.id("addNewRecordButton"));
        addElement.click();
    }
}
