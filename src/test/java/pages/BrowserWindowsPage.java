package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsPage {
    public WebDriver driver;

    public BrowserWindowsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "tabButton")
    public WebElement newTabElement;
    @FindBy(id = "windowButton")
    public WebElement newWindowElement;

    public void interactWithNewTab () {
        newTabElement.click();
        System.out.println(driver.getCurrentUrl());

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

        List<String> windowsList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowsList.get(1));
        System.out.println(driver.getCurrentUrl());

        driver.close();

        driver.switchTo().window(windowsList.get(0));
        System.out.println(driver.getCurrentUrl());
    }



}
