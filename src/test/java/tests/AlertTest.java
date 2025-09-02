package tests;

import org.testng.annotations.Test;
import pages.AlertFrameWindowsPage;
import pages.AlertsPage;
import pages.IndexPage;
import sharedData.SharedData;

public class AlertTest extends SharedData {

    @Test
    public void testMethod() {
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithAlertFrameWindowsMenu();

        AlertFrameWindowsPage alertFrameWindowsPage = new AlertFrameWindowsPage(getDriver());
        alertFrameWindowsPage.interactWithAlertsSubMenu();

        AlertsPage alertsPage = new AlertsPage(getDriver());
        alertsPage.dealWithAlertOk();
        alertsPage.dealWithAlertCancel();
        alertsPage.dealWithAlertValue("EU");
        alertsPage.dealWithAlertTimer();
    }
}
