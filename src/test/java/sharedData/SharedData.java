package sharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SharedData {
    public WebDriver driver;

    @BeforeMethod
    public void prepareEnvironment() {
        //Deschidem un browser
        driver = new ChromeDriver();

        //Accesam un URL
        driver.get("https://demoqa.com/");

        //Maximizam fereastra
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void clearEnvironment() {
        driver.quit();
    }
}
