package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage {
    public WebDriver driver;

    public FramePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "frame1")
    public WebElement frame1;
    @FindBy(id = "sampleHeading")
    public WebElement iframeMessage;

    public void switchToFrame1() {
        driver.switchTo().frame("frame1");
        System.out.println("This is the text from the 1st frame: " + iframeMessage.getText());
    }

    public void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }

    public void switchToFrame2() {
        driver.switchTo().frame("frame2");
        System.out.println("This is the text from the 2nd frame: " + iframeMessage.getText());
    }

}
