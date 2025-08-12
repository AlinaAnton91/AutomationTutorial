package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.util.List;

public class WebTableTest extends SharedData {

    @Test
    public void testMethod() {
        WebElement elementsMenu = driver.findElement(By.xpath("//h5[text()='Elements']"));
        elementsMenu.click();

        WebElement webTablesDubMenu = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTablesDubMenu.click();

        WebElement addElement=driver.findElement(By.id("addNewRecordButton"));
        addElement.click();

        WebElement firstNameElement=driver.findElement(By.id("firstName"));
        String firstNameValue="Sophie";
        firstNameElement.sendKeys(firstNameValue);

        WebElement lastNameElement=driver.findElement(By.id("lastName"));
        String lastNameValue="Turner";
        lastNameElement.sendKeys(lastNameValue);

        WebElement userEmailElement=driver.findElement(By.id("userEmail"));
        String userEmailValue="sophie.turner@gmail.com";
        userEmailElement.sendKeys(userEmailValue);

        WebElement ageElement=driver.findElement(By.id("age"));
        String ageElementValue="35";
        ageElement.sendKeys(ageElementValue);

        WebElement salaryElement=driver.findElement(By.id("salary"));
        String salaryElementValue="3700";
        salaryElement.sendKeys(salaryElementValue);

        WebElement departmentElement=driver.findElement(By.id("department"));
        String departmentElementValue="HR";
        departmentElement.sendKeys(departmentElementValue);


        WebElement submitElement= driver.findElement(By.id("submit"));
        submitElement.click();

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
