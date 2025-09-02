package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "frame1")
    public WebElement frame1;
    @FindBy(id = "sampleHeading")
    public WebElement iframeMessage;

    public void switchToFrame1() {
        driver.switchTo().frame("frame1");
        System.out.println("This is the text from the 1st frame: " + iframeMessage.getText());
        LoggerUtility.info("The browser switches to Frame1");
    }

    public void switchToParentFrame() {
        driver.switchTo().parentFrame();
        LoggerUtility.info("The driver switches back to the ParentFrame");
    }

    public void switchToFrame2() {
        driver.switchTo().frame("frame2");
        System.out.println("This is the text from the 2nd frame: " + iframeMessage.getText());
        LoggerUtility.info("The browser switches to Frame2");
    }

}
