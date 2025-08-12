package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.util.ArrayList;
import java.util.List;

public class TabWindowTest extends SharedData {

    @Test
    public void testMethod() {
        WebElement alertsFrameWindowMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertsFrameWindowMenu.click();

        WebElement browserWindowsSubMenu = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        browserWindowsSubMenu.click();

        WebElement newTabElement = driver.findElement(By.id("tabButton"));
        newTabElement.click();
        System.out.println(driver.getCurrentUrl());

        List<String> tabsList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabsList.get(1));
        System.out.println(driver.getCurrentUrl());

        driver.close();

        driver.switchTo().window(tabsList.get(0));
        System.out.println(driver.getCurrentUrl());

        WebElement newWindowElement = driver.findElement(By.id("windowButton"));
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
