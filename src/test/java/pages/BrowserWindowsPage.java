package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsPage extends BasePage {

    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tabButton")
    private WebElement newTabElement;
    @FindBy(id = "windowButton")
    private WebElement newWindowElement;

    public void interactWithNewTab () {
        newTabElement.click();
        System.out.println(driver.getCurrentUrl());
        LoggerUtility.info("The user clicks on the NewTabElement");

        List<String> tabsList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabsList.get(1));
        System.out.println(driver.getCurrentUrl());

        driver.close();

        driver.switchTo().window(tabsList.get(0));
        System.out.println(driver.getCurrentUrl());

    }

    public void interactWithNewWindow() {
        newWindowElement.click();
        System.out.println(driver.getCurrentUrl());
        LoggerUtility.info("The user clicks on the NewWindowElement");

        List<String> windowsList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowsList.get(1));
        System.out.println(driver.getCurrentUrl());

        driver.close();

        driver.switchTo().window(windowsList.get(0));
        System.out.println(driver.getCurrentUrl());
    }



}
