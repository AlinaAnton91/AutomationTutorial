package tests;
import org.testng.annotations.Test;
import pages.AlertFrameWindowsPage;
import pages.BrowserWindowsPage;
import pages.IndexPage;
import sharedData.SharedData;
public class BrowserWindowsTest extends SharedData {

    @Test
    public void testMethod() {
        IndexPage indexPage = new IndexPage(driver);
        indexPage.interactWithAlertFrameWindowsMenu();

        AlertFrameWindowsPage alertFrameWindowsPage = new AlertFrameWindowsPage(driver);
        alertFrameWindowsPage.interactWithBrowserWindowsSubMenu();

        BrowserWindowsPage browserWindowsPage = new BrowserWindowsPage(driver);
        browserWindowsPage.interactWithNewTab();
        browserWindowsPage.interactWithNewWindow();

    }
}
