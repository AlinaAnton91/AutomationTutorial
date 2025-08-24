package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.IndexPage;
import pages.WebTablePage;
import sharedData.SharedData;

import java.util.List;

public class WebTableTest extends SharedData {

    @Test
    public void testMethod() {
        IndexPage indexPage = new IndexPage(driver);
        indexPage.interactWithElementsMenu();

        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.interactWithWebTableSubMenu();

        String firstNameValue="Sophie" + System.currentTimeMillis();
        String lastNameValue="Turner" + System.currentTimeMillis();
        String userEmailValue="sophie.turner@gmail.com";
        String ageElementValue="35";
        String salaryElementValue="3700";
        String departmentElementValue="HR";
        String editFirstNameValue="Dan" + System.currentTimeMillis();
        String editLastNameValue="Strong" + System.currentTimeMillis();
        String editEmailAddressValue="dan.strong@aol.com";
        String editAgeValue="45";
        String editSalaryValue="7000";
        String editDepartmentValue="C-level";

        WebTablePage webTablePage = new WebTablePage(driver);
        webTablePage.addNewEntry(firstNameValue, lastNameValue, userEmailValue,
                ageElementValue,salaryElementValue, departmentElementValue);

        webTablePage.editNewEntry(editFirstNameValue, editLastNameValue, editEmailAddressValue,
                editAgeValue, editSalaryValue, editDepartmentValue);


        webTablePage.deleteNewEntry(editLastNameValue);

//        Delete
//        WebElement searchElement=driver.findElement(By.cssSelector("input[placeholder='Type to search']"));
//        searchElement.sendKeys(editFirstNameValue);
//
//        WebElement deleteButtonElement=driver.findElement(By.cssSelector("span[id='delete-record-4']"));
//        deleteButtonElement.click();

        List<WebElement> tableRowsElement = driver.findElements(By.cssSelector("div[class='rt-tr-group']"));


    }




}
