package tests;
import org.testng.annotations.Test;
import pages.AlertFrameWindowsPage;
import pages.FramePage;
import pages.IndexPage;
import sharedData.SharedData;

public class FrameTest extends SharedData {

    @Test
    public void testMethod() {
        IndexPage indexPage = new IndexPage(driver);
        indexPage.interactWithAlertFrameWindowsMenu();

        AlertFrameWindowsPage alertFrameWindowsPage = new AlertFrameWindowsPage(driver);
        alertFrameWindowsPage.interactWithFramesSubMenu();

        FramePage framePage = new FramePage(driver);
        framePage.switchToFrame1();
        framePage.switchToParentFrame();
        framePage.switchToFrame2();
    }
}
