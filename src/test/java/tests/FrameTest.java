package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameTest {
    public WebDriver driver;

    @Test
    public void testMethod() {

        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        WebElement alertsFrameWindowMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertsFrameWindowMenu.click();

        WebElement framesSubMenu = driver.findElement(By.xpath("//span[text()='Frames']"));
        framesSubMenu.click();

        driver.switchTo().frame("frame1");
        WebElement iframeMessage = driver.findElement(By.id("sampleHeading"));
        System.out.println(iframeMessage.getText());

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame2");
        iframeMessage = driver.findElement(By.id("sampleHeading"));
        System.out.println(iframeMessage.getText());


    }
}
