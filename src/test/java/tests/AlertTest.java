package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertTest {
    public WebDriver driver;

    @Test
    public void testMethod() {

        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        WebElement alertsFrameWindowMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertsFrameWindowMenu.click();

        WebElement alertsSubMenu = driver.findElement(By.xpath("//span[text()='Alerts']"));
        alertsSubMenu.click();

        WebElement alertOkElement = driver.findElement(By.id("alertButton"));
        alertOkElement.click();
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();

        WebElement alertConfirmElement = driver.findElement(By.id("confirmButton"));
        alertConfirmElement.click();
        Alert alertConfirm = driver.switchTo().alert();
        alertConfirm.dismiss();

        WebElement alertPromptElement = driver.findElement(By.id("promtButton"));
        alertPromptElement.click();
        Alert alertPrompt = driver.switchTo().alert();
        alertPrompt.sendKeys("EU");
        alertPrompt.accept();
    }
}
