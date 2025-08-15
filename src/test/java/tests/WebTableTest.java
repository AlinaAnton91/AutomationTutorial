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

        String firstNameValue="Sophie";
        String lastNameValue="Turner";
        String userEmailValue="sophie.turner@gmail.com";
        String ageElementValue="35";
        String salaryElementValue="3700";
        String departmentElementValue="HR";

        WebTablePage webTablePage = new WebTablePage(driver);
        webTablePage.addNewEntry(firstNameValue, lastNameValue, userEmailValue,
                ageElementValue,salaryElementValue, departmentElementValue);

//        WebElement editElement=driver.findElement(By.cssSelector("span[id='edit-record-4']"));
//        editElement.click();
//
//        WebElement editFirstNameElement=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
//        String editFirstNameValue="Daniela";
//        editFirstNameElement.clear();
//        editFirstNameElement.sendKeys(editFirstNameValue);
//
//        WebElement editLastNameElement=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
//        String editLastNameElementValue="Peter";
//        editLastNameElement.clear();
//        editLastNameElement.sendKeys(editLastNameElementValue);
//
//        WebElement editEmailAddressElement=driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
//        String editEmailAddressValue="daniela.peter@test.co.uk";
//        editEmailAddressElement.clear();
//        editEmailAddressElement.sendKeys(editEmailAddressValue);
//
//        WebElement editAgeElement=driver.findElement(By.cssSelector("input[placeholder='Age']"));
//        String editAgeValue="26";
//        editAgeElement.clear();
//        editAgeElement.sendKeys(editAgeValue);
//
//        WebElement editSalaryElement=driver.findElement(By.cssSelector("input[placeholder='Salary']"));
//        String editSalaryValue="4500";
//        editSalaryElement.clear();
//        editSalaryElement.sendKeys(editSalaryValue);
//
//        WebElement editDepartmentElement=driver.findElement(By.cssSelector("input[placeholder='Department']"));
//        String editDepartmentValue="Finance";
//        editDepartmentElement.clear();
//        editDepartmentElement.sendKeys(editDepartmentValue);
//
//        WebElement editSubmitElement= driver.findElement(By.id("submit"));
//        editSubmitElement.click();

//        WebElement searchElement=driver.findElement(By.cssSelector("input[placeholder='Type to search']"));
//        searchElement.sendKeys(editFirstNameValue);

        //WebElement deleteButtonElement=driver.findElement(By.cssSelector("span[id='delete-record-4']"));
        //deleteButtonElement.click();

        List<WebElement> tableRowsElement = driver.findElements(By.cssSelector("div[class='rt-tr-group']"));


    }




}
