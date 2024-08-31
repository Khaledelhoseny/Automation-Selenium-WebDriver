package modalWindow;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EntryAdPage;

public class ModalWindowTests extends BaseTests {
    @Test
    public void testDismissModalWindow() throws InterruptedException {
      EntryAdPage entryAdPage =  homePage.clickOnentryAdLink() ;
      Thread.sleep(3000);
      entryAdPage.dismissModalWindow();
    }
}
