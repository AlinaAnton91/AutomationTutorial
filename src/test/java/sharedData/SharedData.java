package sharedData;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SharedData {
    public WebDriver driver;

    @BeforeMethod
    public void prepareEnvironment() {
        LoggerUtility.startTest(this.getClass().getSimpleName());

        //Deschidem un browser
        driver = new ChromeDriver();

        //Accesam un URL
        driver.get("https://demoqa.com/");

        //Maximizam fereastra
        driver.manage().window().maximize();

        LoggerUtility.info("The browser was opened with success");
    }

    @AfterMethod
    public void clearEnvironment() {
        driver.quit();

        LoggerUtility.info("The browser was closed with success");
        LoggerUtility.finishTest(this.getClass().getSimpleName());
    }
}
