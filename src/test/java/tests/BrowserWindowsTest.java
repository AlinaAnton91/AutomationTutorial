package tests;
import org.testng.annotations.Test;
import pages.AlertFrameWindowsPage;
import pages.BrowserWindowsPage;
import pages.IndexPage;
import sharedData.SharedData;
public class BrowserWindowsTest extends SharedData {

    @Test
    public void testMethod() {
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithAlertFrameWindowsMenu();

        AlertFrameWindowsPage alertFrameWindowsPage = new AlertFrameWindowsPage(getDriver());
        alertFrameWindowsPage.interactWithBrowserWindowsSubMenu();

        BrowserWindowsPage browserWindowsPage = new BrowserWindowsPage(getDriver());
        browserWindowsPage.interactWithNewTab();
        browserWindowsPage.interactWithNewWindow();

    }
}
