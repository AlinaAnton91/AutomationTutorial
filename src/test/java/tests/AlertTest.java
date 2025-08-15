package tests;

import org.testng.annotations.Test;
import pages.AlertWindowFramePage;
import pages.AlertsPage;
import pages.IndexPage;
import sharedData.SharedData;

public class AlertTest extends SharedData {

    @Test
    public void testMethod() {
        IndexPage indexPage = new IndexPage(driver);
        indexPage.interactWithAlertWindowMenu();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(driver);
        alertWindowFramePage.interactWithAlertsSubMenu();

        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.dealWithAlertOk();
        alertsPage.dealWithAlertCancel();
        alertsPage.dealWithAlertValue("EU");

    }
}
