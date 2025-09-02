package tests;

import org.testng.annotations.Test;
import pages.AlertFrameWindowsPage;
import pages.AlertsPage;
import pages.IndexPage;
import sharedData.SharedData;

public class AlertTest extends SharedData {

    @Test
    public void testMethod() {
        IndexPage indexPage = new IndexPage(driver);
        indexPage.interactWithAlertFrameWindowsMenu();

        AlertFrameWindowsPage alertFrameWindowsPage = new AlertFrameWindowsPage(driver);
        alertFrameWindowsPage.interactWithAlertsSubMenu();

        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.dealWithAlertOk();
        alertsPage.dealWithAlertCancel();
        alertsPage.dealWithAlertValue("EU");
        alertsPage.dealWithAlertTimer();
    }
}
